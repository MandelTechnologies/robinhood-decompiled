package com.robinhood.android.crypto.p094ui.detail.position.views;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionState;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionBanner.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"PositionBanner", "", "type", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;", "onBannerClicked", "Lkotlin/Function0;", "onDismissClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionState$PositionBannerType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.views.PositionBannerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PositionBanner {

    /* compiled from: PositionBanner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.views.PositionBannerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoPositionState.PositionBannerType.values().length];
            try {
                iArr[CryptoPositionState.PositionBannerType.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoPositionState.PositionBannerType.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionBanner$lambda$3(CryptoPositionState.PositionBannerType positionBannerType, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PositionBanner(positionBannerType, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionBanner(final CryptoPositionState.PositionBannerType type2, final Function0<Unit> onBannerClicked, final Function0<Unit> onDismissClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Modifier modifier3;
        Object objRememberedValue;
        AnnotatedString.Builder builder;
        int i5;
        int i6;
        int iPushStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(onBannerClicked, "onBannerClicked");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998554891);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBannerClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1998554891, i4, -1, "com.robinhood.android.crypto.ui.detail.position.views.PositionBanner (PositionBanner.kt:27)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i4 >> 9) & 14, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, (InteractionSource3) objRememberedValue, null, false, null, null, onBannerClicked, 28, null);
                composerStartRestartGroup.startReplaceGroup(-760853117);
                builder = new AnnotatedString.Builder(0, 1, null);
                i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                if (i5 != 1) {
                    i6 = C12757R.string.crypto_position_unavailable_banner_text;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = C12757R.string.crypto_position_pending_banner_text;
                }
                builder.append(StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0));
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                composerStartRestartGroup.startReplaceGroup(-760840510);
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_position_learn_more_banner_text, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString, null, bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i8).m21372getBg20d7_KjU(), modifierM4891clickableO2vRcR0$default, size24, null, onDismissClicked, composerStartRestartGroup, (BentoIcon4.Size24.$stable << 15) | 48 | (29360128 & (i4 << 15)), 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.views.PositionBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PositionBanner.PositionBanner$lambda$3(type2, onBannerClicked, onDismissClicked, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i4 >> 9) & 14, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, (InteractionSource3) objRememberedValue, null, false, null, null, onBannerClicked, 28, null);
            composerStartRestartGroup.startReplaceGroup(-760853117);
            builder = new AnnotatedString.Builder(0, 1, null);
            i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i5 != 1) {
            }
            builder.append(StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0));
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            composerStartRestartGroup.startReplaceGroup(-760840510);
            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null));
            builder.append(StringResources_androidKt.stringResource(C12757R.string.crypto_position_learn_more_banner_text, composerStartRestartGroup, 0));
            Unit unit2 = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composerStartRestartGroup.endReplaceGroup();
            AnnotatedString annotatedString2 = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i82 = BentoTheme.$stable;
            BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString2, null, bentoTheme2.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i82).m21372getBg20d7_KjU(), modifierM4891clickableO2vRcR0$default2, size242, null, onDismissClicked, composerStartRestartGroup, (BentoIcon4.Size24.$stable << 15) | 48 | (29360128 & (i4 << 15)), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
