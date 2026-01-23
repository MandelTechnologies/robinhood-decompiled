package com.robinhood.android.feature.margin.hub.sdui;

import android.os.Parcelable;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.feature.margin.hub.C16839R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.sdui.annotations.SduiComposable;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.MarginHubBufferView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiMarginHubBufferView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a/\u0010\u0010\u001a\u00020\u0011\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a7\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\"\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b\"\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\"\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000f\u0010\b¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002"}, m3636d2 = {"MARGIN_BUFFER_VIEW_ASPECT_RATIO", "", "MARGIN_CALL_BANNER_DISPLAY_TIME", "", "PORTFOLIO_VALUE_KEYPATH", "", "", "getPORTFOLIO_VALUE_KEYPATH", "()[Ljava/lang/String;", "[Ljava/lang/String;", "BUFFER_VALUE_KEYPATH", "getBUFFER_VALUE_KEYPATH", "BUFFER_BANNER_KEYPATH", "getBUFFER_BANNER_KEYPATH", "MARGIN_CALL_BANNER_KEYPATH", "getMARGIN_CALL_BANNER_KEYPATH", "SduiMarginHubBufferView", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarginHubBufferView;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarginHubBufferView;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LargeMarginBufferLottie", "lottiePercentageAnimated", "bufferValueFormatted", "portfolioValueFormatted", "showMarginCallBanner", "", "(FLjava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-hub_externalDebug", "bufferPercentageAnimated", "marginCallBannerShown", "bufferValueAnimated", "portfolioValueAnimated", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SduiMarginHubBufferView2 {
    public static final float MARGIN_BUFFER_VIEW_ASPECT_RATIO = 1.718f;
    public static final long MARGIN_CALL_BANNER_DISPLAY_TIME = 3000;
    private static final String[] PORTFOLIO_VALUE_KEYPATH = {"**", "editable_text_portfolio"};
    private static final String[] BUFFER_VALUE_KEYPATH = {"**", "editable_text_buffer"};
    private static final String[] BUFFER_BANNER_KEYPATH = {"**", ".Buffer_Banner"};
    private static final String[] MARGIN_CALL_BANNER_KEYPATH = {"**", ".Margin-Call_Banner"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LargeMarginBufferLottie$lambda$20$lambda$19(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LargeMarginBufferLottie$lambda$21(float f, String str, String str2, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LargeMarginBufferLottie(f, str, str2, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarginHubBufferView$lambda$17(MarginHubBufferView marginHubBufferView, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarginHubBufferView(marginHubBufferView, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final String[] getPORTFOLIO_VALUE_KEYPATH() {
        return PORTFOLIO_VALUE_KEYPATH;
    }

    public static final String[] getBUFFER_VALUE_KEYPATH() {
        return BUFFER_VALUE_KEYPATH;
    }

    public static final String[] getBUFFER_BANNER_KEYPATH() {
        return BUFFER_BANNER_KEYPATH;
    }

    public static final String[] getMARGIN_CALL_BANNER_KEYPATH() {
        return MARGIN_CALL_BANNER_KEYPATH;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @SduiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarginHubBufferView(final MarginHubBufferView<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        SnapshotState4 snapshotState4;
        boolean zChanged2;
        Object objRememberedValue3;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2;
        boolean zChanged3;
        Object objRememberedValue4;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState3;
        boolean zChanged4;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554595397);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1554595397, i4, -1, "com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferView (SduiMarginHubBufferView.kt:51)");
                }
                float fFloatValue = component.getMargin_buffer_percentage().floatValue();
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(fFloatValue, SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                SnapshotState4<Float> snapshotState4AnimateFloatAsState4 = AnimateAsState.animateFloatAsState(SduiMarginStatusCardContent2.makeLottiePercentage(fFloatValue), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                float fSduiMarginHubBufferView$lambda$0 = SduiMarginHubBufferView$lambda$0(snapshotState4AnimateFloatAsState);
                boolean zSduiMarginHubBufferView$lambda$3 = SduiMarginHubBufferView$lambda$3(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$0) | composerStartRestartGroup.changed(zSduiMarginHubBufferView$lambda$3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$6$lambda$5(snapshotState, snapshotState4AnimateFloatAsState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(SduiMarginHubBufferView$lambda$7(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(snapshotState4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new SduiMarginHubBufferView3(snapshotState4, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(component.getMargin_buffer_amount().getAmount().floatValue(), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                float fSduiMarginHubBufferView$lambda$9 = SduiMarginHubBufferView$lambda$9(snapshotState4AnimateFloatAsState2);
                float fSduiMarginHubBufferView$lambda$02 = SduiMarginHubBufferView$lambda$0(snapshotState4AnimateFloatAsState);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged3 = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$9) | composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$02);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$11$lambda$10(snapshotState4AnimateFloatAsState2, snapshotState4AnimateFloatAsState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(component.getPortfolio_value().getAmount().floatValue(), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                float fSduiMarginHubBufferView$lambda$13 = SduiMarginHubBufferView$lambda$13(snapshotState4AnimateFloatAsState3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged4 = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$13);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$15$lambda$14(snapshotState4AnimateFloatAsState3);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                LargeMarginBufferLottie(SduiMarginHubBufferView$lambda$1(snapshotState4AnimateFloatAsState4), SduiMarginHubBufferView$lambda$12(snapshotState42), SduiMarginHubBufferView$lambda$16((SnapshotState4) objRememberedValue5), SduiMarginHubBufferView$lambda$7(snapshotState4), modifier4, composerStartRestartGroup, (i4 << 9) & 57344, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$17(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float fFloatValue2 = component.getMargin_buffer_percentage().floatValue();
            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(fFloatValue2, SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState42 = AnimateAsState.animateFloatAsState(SduiMarginStatusCardContent2.makeLottiePercentage(fFloatValue2), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float fSduiMarginHubBufferView$lambda$03 = SduiMarginHubBufferView$lambda$0(snapshotState4AnimateFloatAsState);
            boolean zSduiMarginHubBufferView$lambda$32 = SduiMarginHubBufferView$lambda$3(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$03) | composerStartRestartGroup.changed(zSduiMarginHubBufferView$lambda$32);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$6$lambda$5(snapshotState, snapshotState4AnimateFloatAsState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf2 = Boolean.valueOf(SduiMarginHubBufferView$lambda$7(snapshotState4));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(snapshotState4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = new SduiMarginHubBufferView3(snapshotState4, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                    snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(component.getMargin_buffer_amount().getAmount().floatValue(), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                    float fSduiMarginHubBufferView$lambda$92 = SduiMarginHubBufferView$lambda$9(snapshotState4AnimateFloatAsState2);
                    float fSduiMarginHubBufferView$lambda$022 = SduiMarginHubBufferView$lambda$0(snapshotState4AnimateFloatAsState);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged3 = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$92) | composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$022);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged3) {
                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$11$lambda$10(snapshotState4AnimateFloatAsState2, snapshotState4AnimateFloatAsState);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(component.getPortfolio_value().getAmount().floatValue(), SduiMarginStatusCardContent2.getMarginHubAnimationSpec(), 0.0f, null, null, composerStartRestartGroup, 0, 28);
                        float fSduiMarginHubBufferView$lambda$132 = SduiMarginHubBufferView$lambda$13(snapshotState4AnimateFloatAsState3);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged4 = composerStartRestartGroup.changed(fSduiMarginHubBufferView$lambda$132);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4) {
                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SduiMarginHubBufferView2.SduiMarginHubBufferView$lambda$15$lambda$14(snapshotState4AnimateFloatAsState3);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier42 = modifier3;
                            LargeMarginBufferLottie(SduiMarginHubBufferView$lambda$1(snapshotState4AnimateFloatAsState42), SduiMarginHubBufferView$lambda$12(snapshotState422), SduiMarginHubBufferView$lambda$16((SnapshotState4) objRememberedValue5), SduiMarginHubBufferView$lambda$7(snapshotState4), modifier42, composerStartRestartGroup, (i4 << 9) & 57344, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiMarginHubBufferView$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiMarginHubBufferView$lambda$6$lambda$5(SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        return !SduiMarginHubBufferView$lambda$3(snapshotState) && SduiMarginHubBufferView$lambda$0(snapshotState4) <= 0.05f;
    }

    private static final LottieComposition LargeMarginBufferLottie$lambda$18(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float SduiMarginHubBufferView$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float SduiMarginHubBufferView$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final String SduiMarginHubBufferView$lambda$12(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final float SduiMarginHubBufferView$lambda$13(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final String SduiMarginHubBufferView$lambda$16(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean SduiMarginHubBufferView$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiMarginHubBufferView$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float SduiMarginHubBufferView$lambda$9(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SduiMarginHubBufferView$lambda$11$lambda$10(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        return Formats.getCurrencyFormat().format(Float.valueOf(SduiMarginHubBufferView$lambda$9(snapshotState4))) + " (" + Formats.getHundredthPercentFormat().format(Float.valueOf(SduiMarginHubBufferView$lambda$0(snapshotState42))) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SduiMarginHubBufferView$lambda$15$lambda$14(SnapshotState4 snapshotState4) {
        return Formats.getCurrencyFormat().format(Float.valueOf(SduiMarginHubBufferView$lambda$13(snapshotState4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LargeMarginBufferLottie(final float f, final String bufferValueFormatted, final String portfolioValueFormatted, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bufferValueFormatted, "bufferValueFormatted");
        Intrinsics.checkNotNullParameter(portfolioValueFormatted, "portfolioValueFormatted");
        Composer composerStartRestartGroup = composer.startRestartGroup(1618513160);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(bufferValueFormatted) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(portfolioValueFormatted) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1618513160, i3, -1, "com.robinhood.android.feature.margin.hub.sdui.LargeMarginBufferLottie (SduiMarginHubBufferView.kt:116)");
                }
                if (!((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                    i4 = C16839R.raw.lottie_margin_hub_buffer_view_day;
                } else {
                    i4 = C16839R.raw.lottie_margin_hub_buffer_view_night;
                }
                Modifier modifier5 = modifier4;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i4)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), 1.718f, false, 2, null);
                LottieComposition lottieCompositionLargeMarginBufferLottie$lambda$18 = LargeMarginBufferLottie$lambda$18(lottieCompositionResultRememberLottieComposition);
                CharSequence charSequence = LottieProperty.TEXT;
                if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                    str = PlaceholderUtils.XXShortPlaceholderText + portfolioValueFormatted + PlaceholderUtils.XXShortPlaceholderText;
                } else {
                    str = portfolioValueFormatted;
                }
                String[] strArr = PORTFOLIO_VALUE_KEYPATH;
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty = LottieDynamicProperties2.rememberLottieDynamicProperty(charSequence, str, (String[]) Arrays.copyOf(strArr, strArr.length), composerStartRestartGroup, 6);
                String str2 = z ? bufferValueFormatted : "";
                String[] strArr2 = BUFFER_VALUE_KEYPATH;
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty2 = LottieDynamicProperties2.rememberLottieDynamicProperty(charSequence, str2, (String[]) Arrays.copyOf(strArr2, strArr2.length), composerStartRestartGroup, 6);
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty3 = LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TEXT_SIZE, Float.valueOf(bufferValueFormatted.length() < 20 ? 22.0f : 25.0f), (String[]) Arrays.copyOf(strArr2, strArr2.length), composerStartRestartGroup, 6);
                Integer num = LottieProperty.TRANSFORM_OPACITY;
                Integer numValueOf = Integer.valueOf(z ? 100 : 0);
                String[] strArr3 = BUFFER_BANNER_KEYPATH;
                LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty4 = LottieDynamicProperties2.rememberLottieDynamicProperty(num, numValueOf, (String[]) Arrays.copyOf(strArr3, strArr3.length), composerStartRestartGroup, 6);
                Integer numValueOf2 = Integer.valueOf(!z ? 100 : 0);
                String[] strArr4 = MARGIN_CALL_BANNER_KEYPATH;
                LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{lottieDynamicProperties3RememberLottieDynamicProperty, lottieDynamicProperties3RememberLottieDynamicProperty2, lottieDynamicProperties3RememberLottieDynamicProperty3, lottieDynamicProperties3RememberLottieDynamicProperty4, LottieDynamicProperties2.rememberLottieDynamicProperty(num, numValueOf2, (String[]) Arrays.copyOf(strArr4, strArr4.length), composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
                ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiMarginHubBufferView2.LargeMarginBufferLottie$lambda$20$lambda$19(f));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionLargeMarginBufferLottie$lambda$18, (Function0) objRememberedValue, modifierAspectRatio$default, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, fillWidth, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 6, 64248);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiMarginHubBufferView2.LargeMarginBufferLottie$lambda$21(f, bufferValueFormatted, portfolioValueFormatted, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
            }
            Modifier modifier52 = modifier4;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(i4)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifierAspectRatio$default2 = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null), 1.718f, false, 2, null);
            LottieComposition lottieCompositionLargeMarginBufferLottie$lambda$182 = LargeMarginBufferLottie$lambda$18(lottieCompositionResultRememberLottieComposition2);
            CharSequence charSequence2 = LottieProperty.TEXT;
            if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
            }
            String[] strArr5 = PORTFOLIO_VALUE_KEYPATH;
            LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty5 = LottieDynamicProperties2.rememberLottieDynamicProperty(charSequence2, str, (String[]) Arrays.copyOf(strArr5, strArr5.length), composerStartRestartGroup, 6);
            if (z) {
            }
            String[] strArr22 = BUFFER_VALUE_KEYPATH;
            LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty22 = LottieDynamicProperties2.rememberLottieDynamicProperty(charSequence2, str2, (String[]) Arrays.copyOf(strArr22, strArr22.length), composerStartRestartGroup, 6);
            LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty32 = LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TEXT_SIZE, Float.valueOf(bufferValueFormatted.length() < 20 ? 22.0f : 25.0f), (String[]) Arrays.copyOf(strArr22, strArr22.length), composerStartRestartGroup, 6);
            Integer num2 = LottieProperty.TRANSFORM_OPACITY;
            Integer numValueOf3 = Integer.valueOf(z ? 100 : 0);
            String[] strArr32 = BUFFER_BANNER_KEYPATH;
            LottieDynamicProperties3 lottieDynamicProperties3RememberLottieDynamicProperty42 = LottieDynamicProperties2.rememberLottieDynamicProperty(num2, numValueOf3, (String[]) Arrays.copyOf(strArr32, strArr32.length), composerStartRestartGroup, 6);
            Integer numValueOf22 = Integer.valueOf(!z ? 100 : 0);
            String[] strArr42 = MARGIN_CALL_BANNER_KEYPATH;
            LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties2 = LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{lottieDynamicProperties3RememberLottieDynamicProperty5, lottieDynamicProperties3RememberLottieDynamicProperty22, lottieDynamicProperties3RememberLottieDynamicProperty32, lottieDynamicProperties3RememberLottieDynamicProperty42, LottieDynamicProperties2.rememberLottieDynamicProperty(num2, numValueOf22, (String[]) Arrays.copyOf(strArr42, strArr42.length), composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable);
            ContentScale fillWidth2 = ContentScale.INSTANCE.getFillWidth();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z2) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.sdui.SduiMarginHubBufferViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(SduiMarginHubBufferView2.LargeMarginBufferLottie$lambda$20$lambda$19(f));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionLargeMarginBufferLottie$lambda$182, (Function0) objRememberedValue, modifierAspectRatio$default2, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties2, null, fillWidth2, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 6, 64248);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
