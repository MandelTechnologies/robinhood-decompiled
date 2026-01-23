package com.robinhood.shared.i18n.dynamic.translations;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicTranslationsContextWrapper.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "", "wrap", "Landroid/content/Context;", "context", "Stub", "lib-dynamic-translations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface DynamicTranslationsContextWrapper {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: DynamicTranslationsContextWrapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Context wrap(DynamicTranslationsContextWrapper dynamicTranslationsContextWrapper, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context;
        }
    }

    Context wrap(Context context);

    /* compiled from: DynamicTranslationsContextWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper$Stub;", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "<init>", "()V", "wrap", "Landroid/content/Context;", "context", "lib-dynamic-translations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper$Stub, reason: from kotlin metadata */
    public static final class Companion implements DynamicTranslationsContextWrapper {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper
        public Context wrap(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context;
        }

        private Companion() {
        }
    }
}
