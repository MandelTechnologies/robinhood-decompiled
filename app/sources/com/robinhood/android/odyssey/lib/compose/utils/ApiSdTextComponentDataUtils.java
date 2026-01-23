package com.robinhood.android.odyssey.lib.compose.utils;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiSdTextComponentDataUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"toCompose", "Landroidx/compose/ui/text/TextStyle;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$TextAppearance;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$TextAppearance;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/style/TextAlign;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$Alignment;", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$Alignment;Landroidx/compose/runtime/Composer;I)I", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.compose.utils.ApiSdTextComponentDataUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ApiSdTextComponentDataUtils {

    /* compiled from: ApiSdTextComponentDataUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.compose.utils.ApiSdTextComponentDataUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiSdTextComponentData.TextAppearance.values().length];
            try {
                iArr[ApiSdTextComponentData.TextAppearance.DISPLAY_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.DISPLAY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.DISPLAY_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.REGULAR_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.REGULAR_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.REGULAR_LARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.BOOK_COVER_CAPSULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiSdTextComponentData.TextAppearance.BOOK_COVER_NIB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdTextComponentData.Alignment.values().length];
            try {
                iArr2[ApiSdTextComponentData.Alignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiSdTextComponentData.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiSdTextComponentData.Alignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TextStyle toCompose(ApiSdTextComponentData.TextAppearance textAppearance, Composer composer, int i) {
        TextStyle displayCapsuleSmall;
        Intrinsics.checkNotNullParameter(textAppearance, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1946814948, i, -1, "com.robinhood.android.odyssey.lib.compose.utils.toCompose (ApiSdTextComponentDataUtils.kt:11)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[textAppearance.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1716571337);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall();
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-1716568808);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium();
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-1716566281);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge();
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-1716563799);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS();
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-1716561719);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(-1716559671);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL();
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(-1716557447);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getBookCoverCapsuleSmall();
                composer.endReplaceGroup();
                break;
            case 8:
                composer.startReplaceGroup(-1716554859);
                displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getBookCoverNibSmall();
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-1716573054);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return displayCapsuleSmall;
    }

    public static final int toCompose(ApiSdTextComponentData.Alignment alignment, Composer composer, int i) {
        int iM7924getStarte0LSkKk;
        Intrinsics.checkNotNullParameter(alignment, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1232442274, i, -1, "com.robinhood.android.odyssey.lib.compose.utils.toCompose (ApiSdTextComponentDataUtils.kt:24)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[alignment.ordinal()];
        if (i2 == 1) {
            iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
        } else if (i2 == 2) {
            iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iM7924getStarte0LSkKk;
    }
}
