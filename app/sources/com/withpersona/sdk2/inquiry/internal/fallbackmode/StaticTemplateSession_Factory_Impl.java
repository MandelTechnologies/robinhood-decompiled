package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.List;

/* loaded from: classes18.dex */
public final class StaticTemplateSession_Factory_Impl implements StaticTemplateSession.Factory {
    private final C50859StaticTemplateSession_Factory delegateFactory;

    StaticTemplateSession_Factory_Impl(C50859StaticTemplateSession_Factory c50859StaticTemplateSession_Factory) {
        this.delegateFactory = c50859StaticTemplateSession_Factory;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession.Factory
    public StaticTemplateSession create(List<? extends NextStep> list, String str) {
        return this.delegateFactory.get(list, str);
    }

    public static Provider<StaticTemplateSession.Factory> createFactoryProvider(C50859StaticTemplateSession_Factory c50859StaticTemplateSession_Factory) {
        return InstanceFactory.create(new StaticTemplateSession_Factory_Impl(c50859StaticTemplateSession_Factory));
    }
}
