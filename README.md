# java_jsf_summarize

有关java中jsf框架的介绍以及基本的使用，用于初学者的入门教程


---------------------------------------------------------------------------------------------------

第三部分jsf_03的介绍：

----第一个重点：这个部分主要介绍的是jsf与其收管bean的结合使用，重点的部分是作用域为flow(即：流部分)的用法处理。

重点的部分看看order文件夹下的order-flow.xml，这个是流实现的主要配置，规定了流的执行处理以及最后的接受部分。

流实现的开始在home.jsp中调用，进入order文件夹，首先执行的是order.xhtml这个部分，之后的处理进行按照，action中规定的路径文件执行。

最后需要注意的是，bean中有关orderBean.java的处理，其中除了getter与setter方法之外，还包括一个返回方法。与order文件夹中的order.xhtml配置对应，流结束完成后再次回到home.jsp这个页面中。


----第二个重点：这个部分主要介绍的是jsf转换和验证用户的输入的情况，主要使用的两个类是<1>Converter<2>Validator。

用法主要是建立用于转换和验证的类，是这俩个类分别实现与<1>Converter<2>Validator这两个接口，之后去实现这两个类下的方法。设计你自己需要规定的数据格式部分，最后到faces-config.xml配置文件中去部署自己写好的jsf转换器以及验证器，在页面UI中引用这两个类中你所规定的id，根据你的需要来进行你的方法的引用。

这里的验证器以及转换器也可以写在你所建立的bean文件中，不需要实现这里所说的两个类，直接来进行方法的创建，来增加你所需要的即可，调用时与之前的不同，你这时根据的是EI表达式中的结构以及描述来实现，举例: #{ConverterBean.Converterfunction}，与之前的属性引用类似。

---------------------------------------------------------------------------------------------------

第四部分jsf_04的介绍：

----第一个重点：这个部分主要介绍的是应用jsf框架的web应用程序页面之间的转换问题，也就是我们常说的页面之间的跳转，web中导航栏的管理。

重点的配置主要在faces-config.xml中实现，<navigation-rule>标签指定应用程序从一个页面跳转到其他页面的肯元素，<from-view-id>规定导航开始的根元素，即导航开始的地方，<navigation-case>用于规定导航执行的条件配置，具体的条件在<from-action>标签中规定，若满足其中所规定 的条件，则跳转到<to-view-id>标签中所规定的页面。

这里重点介绍的是faces-config.xml配置文件中的<redirect>标签，这个主要用来实现jsf中的请求分发机制。规定页面在发生重定向之后url是否发生改变，这个主要的表现是：客户端是否重新发送一个新的http请求到服务器中，这里的表现就是为了请求时可以获得新的页面下的资源。

理解这个地方还需结合看下dynamic文件下的页面部分，与之前的faces-config.xml配置文件一同理解，可以清晰的理解有关导航的执行流程，具体的方法实现在com.wt.bean包下的UserBean.java文件下，这里主要介绍了验证信息的处理方法，用来验证用户发来的信息，最后判断要跳转的url。实现页面的跳转。

----第二个重点：这个部分主要介绍的是有关全局导航以及条件导航的设置处理部分，重要的设置可以参考faces-config.xml配置文件中的<from-view-id>标签，删除这个标签或者在标签中写*，这两中方式都可以实现全局的导航设置。如果实现条件导航，需要做的则是在这个标签中写入你想要设置导航的页面url，并且按照<from-action>标签中的条件方法按照你所规定的导航条件来进行特定的页面跳转。

----第三个重点：这个部分主要介绍的是faces-config.xml配置文件中的<if>标签，可以让你按照if-else或者if--else-if--else的方法进行特定 的页面跳转。即根据你所写方法的返回值的不同跳转到不同的页面。


---------------------------------------------------

这两天期末考试，之后会更新内容以及rename的排版部分。  先mark。

