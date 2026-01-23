package com.robinhood.android.gdpr.consent;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySetting.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"title", "", "Lcom/robinhood/android/gdpr/consent/PrivacySetting;", "getTitle", "(Lcom/robinhood/android/gdpr/consent/PrivacySetting;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "text", "getText", "checkedIcon", "Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "getCheckedIcon", "(Lcom/robinhood/android/gdpr/consent/PrivacySetting;)Lcom/robinhood/compose/bento/component/BentoIcons$Size16;", "feature-gdpr-consent_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PrivacySetting2 {

    /* compiled from: PrivacySetting.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrivacySetting.values().length];
            try {
                iArr[PrivacySetting.STRICTLY_NECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacySetting.FUNCTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacySetting.MARKETING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrivacySetting.PERFORMANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmName
    public static final String getTitle(PrivacySetting privacySetting, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(privacySetting, "<this>");
        composer.startReplaceGroup(781150755);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(781150755, i, -1, "com.robinhood.android.gdpr.consent.<get-title> (PrivacySetting.kt:16)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[privacySetting.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-933398518);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_strictly_necessary_title, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-933395038);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_functional_title, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(-933391839);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_marketing_title, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(-933400038);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-933388605);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_performance_title, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    @JvmName
    public static final String getText(PrivacySetting privacySetting, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(privacySetting, "<this>");
        composer.startReplaceGroup(29014905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(29014905, i, -1, "com.robinhood.android.gdpr.consent.<get-text> (PrivacySetting.kt:25)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[privacySetting.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(2113522655);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_strictly_necessary_text, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(2113526103);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_functional_text, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(2113529270);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_marketing_text, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(2113521132);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(2113532472);
            strStringResource = StringResources_androidKt.stringResource(C17671R.string.privacy_settings_performance_text, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public static final BentoIcon4.Size16 getCheckedIcon(PrivacySetting privacySetting) {
        Intrinsics.checkNotNullParameter(privacySetting, "<this>");
        if (WhenMappings.$EnumSwitchMapping$0[privacySetting.ordinal()] == 1) {
            return new BentoIcon4.Size16(ServerToBentoAssetMapper2.LOCK_16);
        }
        return null;
    }
}
