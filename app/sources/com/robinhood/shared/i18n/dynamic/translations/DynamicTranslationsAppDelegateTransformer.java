package com.robinhood.shared.i18n.dynamic.translations;

import android.app.Activity;
import androidx.appcompat.app.AppCompatDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicTranslationsAppDelegateTransformer.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsAppDelegateTransformer;", "", "wrap", "Landroidx/appcompat/app/AppCompatDelegate;", "delegate", "activity", "Landroid/app/Activity;", "Stub", "lib-dynamic-translations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface DynamicTranslationsAppDelegateTransformer {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    AppCompatDelegate wrap(AppCompatDelegate delegate, Activity activity);

    /* compiled from: DynamicTranslationsAppDelegateTransformer.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsAppDelegateTransformer$Stub;", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsAppDelegateTransformer;", "<init>", "()V", "wrap", "Landroidx/appcompat/app/AppCompatDelegate;", "delegate", "activity", "Landroid/app/Activity;", "lib-dynamic-translations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsAppDelegateTransformer$Stub, reason: from kotlin metadata */
    public static final class Companion implements DynamicTranslationsAppDelegateTransformer {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsAppDelegateTransformer
        public AppCompatDelegate wrap(AppCompatDelegate delegate, Activity activity) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(activity, "activity");
            return delegate;
        }

        private Companion() {
        }
    }
}
