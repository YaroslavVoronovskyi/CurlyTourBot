package com.gmail.voronovskyi.yaroslav.curlytourbot.processors;

public interface IAppProcessorFactory {

    IAppActionProcessor getProcessorByAction(String actionTitle);
}
