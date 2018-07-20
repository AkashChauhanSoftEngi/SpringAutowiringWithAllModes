# SpringAutowiringWithModes
* we use Autowiring to connect object refrences to the IOC beans without using <"property<>"> and <"constructor-arg<>">" in spring xml
* Autowiring can be achieved using these in spring xml file {Reference: https://www.youtube.com/watch?v=suiEGbKf21g&t=2s}
	- autowire="byName"
	- autowire="byType"
	- autowire="constructor"
	- autowire="autodetect"
	- autowire="no"
	- autowire="default"

* Autowiring using byName
```xml
	<bean id="trianglebean" class="com.java.spring.Triangle" autowire="byName">
	</bean>
```

* Autowiring using byType
```xml
	<bean id="trianglebeanTwo" class="com.java.spring.Triangle" autowire="byType">
	</bean>
```

* Simple beans to Autowire
```xml
	<bean id="pointA" class="com.java.spring.Point">
		<property name="x" value="1" />
		<property name="y" value="2" />
	</bean>

	<bean id="pointB" class="com.java.spring.Point">
		<property name="x" value="3" />
		<property name="y" value="4" />
	</bean>

	<bean id="pointC" class="com.java.spring.Point">
		<property name="x" value="5" />
		<property name="y" value="6" />
	</bean>
```

* Autowiring using by constructor
```xml
	<bean id="areabean" class="com.java.spring.Area" autowire="constructor">
	</bean>
```

* Autowiring using by autodetect
```xml
	<bean id="areabeatwo" class="com.java.spring.Area" autowire="autodetect">
	</bean>
```

* Autowiring using by no or default {No Autowiring}
```xml
	<bean id="dimentionbean" class="com.java.spring.Dimention" autowire="no">
		<property name="pointA" ref="pointA"></property>
	</bean>
```
