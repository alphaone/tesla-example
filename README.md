# TESLA Example

A Clojure library designed to ... well, that part is up to you.

## Current Status

It throws an ugly error I don't understand:

```
Exception in thread "main" clojure.lang.ExceptionInfo: Error in component :routes in system com.stuartsierra.component.SystemMap calling #'com.stuartsierra.component/start {:reason :com.stuartsierra.component/component-function-threw-exception, :function #'com.stuartsierra.component/start, :system-key :routes, :component #de.otto.tesla.stateful.routes.Routes{}, :system #<SystemMap>}
    at clojure.core$ex_info.invoke(core.clj:4327)
    at com.stuartsierra.component$try_action.invoke(component.clj:101)
    at com.stuartsierra.component$update_system$fn__310.invoke(component.clj:125)
    at clojure.core.protocols$fn__6037.invoke(protocols.clj:127)
    at clojure.core.protocols$fn__6005$G__6000__6014.invoke(protocols.clj:19)
    at clojure.core.protocols$seq_reduce.invoke(protocols.clj:31)
    at clojure.core.protocols$fn__6028.invoke(protocols.clj:48)
    at clojure.core.protocols$fn__5979$G__5974__5992.invoke(protocols.clj:13)
    at clojure.core$reduce.invoke(core.clj:6177)
    at com.stuartsierra.component$update_system.doInvoke(component.clj:129)
    at clojure.lang.RestFn.invoke(RestFn.java:445)
    at com.stuartsierra.component$start_system.invoke(component.clj:151)
    at com.stuartsierra.component$start_system.invoke(component.clj:149)
    at com.stuartsierra.component.SystemMap.start(component.clj:166)
    at de.otto.tesla.system$start_system.invoke(system.clj:21)
    at de.otto.tesla.example.example_system$_main.doInvoke(example_system.clj:22)
    at clojure.lang.RestFn.invoke(RestFn.java:397)
    at clojure.lang.Var.invoke(Var.java:411)
    at user$eval5$fn__7.invoke(form-init4765495622879991085.clj:1)
    at user$eval5.invoke(form-init4765495622879991085.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:6619)
    at clojure.lang.Compiler.eval(Compiler.java:6609)
    at clojure.lang.Compiler.load(Compiler.java:7064)
    at clojure.lang.Compiler.loadFile(Compiler.java:7020)
    at clojure.main$load_script.invoke(main.clj:294)
    at clojure.main$init_opt.invoke(main.clj:299)
    at clojure.main$initialize.invoke(main.clj:327)
    at clojure.main$null_opt.invoke(main.clj:362)
    at clojure.main$main.doInvoke(main.clj:440)
    at clojure.lang.RestFn.invoke(RestFn.java:421)
    at clojure.lang.Var.invoke(Var.java:419)
    at clojure.lang.AFn.applyToHelper(AFn.java:163)
    at clojure.lang.Var.applyTo(Var.java:532)
    at clojure.main.main(main.java:37)
Caused by: java.lang.NoSuchMethodError: clojure.lang.Reflector.invokeNoArgInstanceMember(Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;
    at de.otto.tesla.util.escapingmessageconverter$_convert.invoke(escapingmessageconverter.clj:7)
    at de.otto.tesla.util.escapingmessageconverter.convert(Unknown Source)
    at ch.qos.logback.core.pattern.FormattingConverter.write(FormattingConverter.java:37)
    at ch.qos.logback.core.pattern.PatternLayoutBase.writeLoopOnConverters(PatternLayoutBase.java:119)
    at ch.qos.logback.classic.PatternLayout.doLayout(PatternLayout.java:149)
    at ch.qos.logback.classic.PatternLayout.doLayout(PatternLayout.java:39)
    at ch.qos.logback.core.encoder.LayoutWrappingEncoder.doEncode(LayoutWrappingEncoder.java:134)
    at ch.qos.logback.core.OutputStreamAppender.writeOut(OutputStreamAppender.java:194)
    at ch.qos.logback.core.OutputStreamAppender.subAppend(OutputStreamAppender.java:219)
    at ch.qos.logback.core.OutputStreamAppender.append(OutputStreamAppender.java:103)
    at ch.qos.logback.core.UnsynchronizedAppenderBase.doAppend(UnsynchronizedAppenderBase.java:88)
    at ch.qos.logback.core.spi.AppenderAttachableImpl.appendLoopOnAppenders(AppenderAttachableImpl.java:48)
    at ch.qos.logback.classic.Logger.appendLoopOnAppenders(Logger.java:273)
    at ch.qos.logback.classic.Logger.callAppenders(Logger.java:260)
    at ch.qos.logback.classic.Logger.buildLoggingEventAndAppend(Logger.java:442)
    at ch.qos.logback.classic.Logger.filterAndLog_0_Or3Plus(Logger.java:396)
    at ch.qos.logback.classic.Logger.info(Logger.java:600)
    at clojure.tools.logging$eval724$fn__730.invoke(logging.clj:288)
    at clojure.tools.logging.impl$eval475$fn__476$G__464__487.invoke(impl.clj:16)
    at clojure.tools.logging$log_STAR_.invoke(logging.clj:64)
    at de.otto.tesla.stateful.routes.Routes.start(routes.clj:13)
    at com.stuartsierra.component$eval252$fn__253$G__244__255.invoke(component.clj:4)
    at com.stuartsierra.component$eval252$fn__253$G__243__258.invoke(component.clj:4)
    at clojure.lang.Var.invoke(Var.java:415)
    at clojure.lang.AFn.applyToHelper(AFn.java:161)
    at clojure.lang.Var.applyTo(Var.java:532)
    at clojure.core$apply.invoke(core.clj:619)
    at com.stuartsierra.component$try_action.invoke(component.clj:98)
    ... 32 more
```

## Usage

FIXME

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
