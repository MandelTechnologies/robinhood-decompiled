package com.robinhood.android.doc;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.doc.p109ui.persona.PersonaEnvironment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadModule_ProvidePersonaEnvironmentFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/DocUploadModule_ProvidePersonaEnvironmentFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/doc/ui/persona/PersonaEnvironment;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "providePersonaEnvironment", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadModule_ProvidePersonaEnvironmentFactory implements Factory<PersonaEnvironment> {
    public static final int $stable = 0;
    public static final DocUploadModule_ProvidePersonaEnvironmentFactory INSTANCE = new DocUploadModule_ProvidePersonaEnvironmentFactory();

    private DocUploadModule_ProvidePersonaEnvironmentFactory() {
    }

    @Override // javax.inject.Provider
    public PersonaEnvironment get() {
        return providePersonaEnvironment();
    }

    @JvmStatic
    public static final DocUploadModule_ProvidePersonaEnvironmentFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final PersonaEnvironment providePersonaEnvironment() {
        Object objCheckNotNull = Preconditions.checkNotNull(DocUploadModule.INSTANCE.providePersonaEnvironment(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (PersonaEnvironment) objCheckNotNull;
    }
}
