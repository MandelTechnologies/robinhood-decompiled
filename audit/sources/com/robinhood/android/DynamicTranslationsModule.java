package com.robinhood.android;

import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsAppDelegateTransformer;
import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper;
import kotlin.Metadata;

/* compiled from: DynamicTranslationsModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/DynamicTranslationsModule;", "", "<init>", "()V", "provideDynamicTranslationsAppDelegateTransformer", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsAppDelegateTransformer;", "provideDynamicTranslationsContextWrapper", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class DynamicTranslationsModule {
    public static final DynamicTranslationsModule INSTANCE = new DynamicTranslationsModule();

    private DynamicTranslationsModule() {
    }

    public final DynamicTranslationsAppDelegateTransformer provideDynamicTranslationsAppDelegateTransformer() {
        return DynamicTranslationsAppDelegateTransformer.INSTANCE;
    }

    public final DynamicTranslationsContextWrapper provideDynamicTranslationsContextWrapper() {
        return DynamicTranslationsContextWrapper.INSTANCE;
    }
}
