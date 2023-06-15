package com.gmail.voronovskyi.yaroslav.curlytourbot.processors.impl.app;

import com.gmail.voronovskyi.yaroslav.curlytourbot.processors.IAppActionProcessor;
import com.gmail.voronovskyi.yaroslav.curlytourbot.processors.IAppProcessorFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class AppProcessorFactory implements IAppProcessorFactory {

    private final Map<String, IAppActionProcessor> appActionProcessorsMap;

    public AppProcessorFactory(List<IAppActionProcessor> appActionProcessorsList) {
        appActionProcessorsMap = appActionProcessorsList.stream()
                .collect(Collectors.toMap(IAppActionProcessor::getSupportedActionTitle, Function.identity()));
    }

    @Override
    public IAppActionProcessor getProcessorByAction(String actionTitle) {
        return appActionProcessorsMap.get(actionTitle);
    }
}
