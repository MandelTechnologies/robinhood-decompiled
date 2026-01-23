package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.RemoteLottie;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.LottieDto;

/* compiled from: SduiRemoteLottie.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"SduiRemoteLottie", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/RemoteLottie;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/RemoteLottie;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lrh_server_driven_ui/v1/LottieDto;", "(Lrh_server_driven_ui/v1/LottieDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "lib-sdui_externalRelease", "jsonString", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiRemoteLottie2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRemoteLottie$lambda$14(RemoteLottie remoteLottie, Modifier modifier, int i, Composer composer, int i2) {
        SduiRemoteLottie(remoteLottie, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiRemoteLottie$lambda$24(LottieDto lottieDto, Modifier modifier, int i, Composer composer, int i2) {
        SduiRemoteLottie(lottieDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiRemoteLottie(final RemoteLottie<? extends ActionT> component, final Modifier modifier, Composer composer, final int i) {
        LottieCompositionSpec lottieCompositionSpecM9176boximpl;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1744311497);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1744311497, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottie (SduiRemoteLottie.kt:40)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            MicrogramResourceLoader microgramResourceLoader = (MicrogramResourceLoader) composerStartRestartGroup.consume(MicrogramResourceLoader2.getLocalMicrogramResourceLoader());
            String light_mode_content_link = ((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0) ? component.getLight_mode_content_link() : component.getDark_mode_content_link();
            composerStartRestartGroup.startReplaceGroup(1246116571);
            if (!StringsKt.startsWith$default(light_mode_content_link, "http", false, 2, (Object) null)) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(microgramResourceLoader) | composerStartRestartGroup.changed(light_mode_content_link);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SduiRemoteLottie3(microgramResourceLoader, light_mode_content_link, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(light_mode_content_link, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1246130565);
            String strSduiRemoteLottie$lambda$1 = SduiRemoteLottie$lambda$1(snapshotState);
            if (strSduiRemoteLottie$lambda$1 == null || strSduiRemoteLottie$lambda$1.length() == 0) {
                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0) ? component.getLight_mode_content_link() : component.getDark_mode_content_link()));
            } else {
                String strSduiRemoteLottie$lambda$12 = SduiRemoteLottie$lambda$1(snapshotState);
                if (strSduiRemoteLottie$lambda$12 == null) {
                    strSduiRemoteLottie$lambda$12 = "";
                }
                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.JsonString.m9164boximpl(LottieCompositionSpec.JsonString.m9165constructorimpl(strSduiRemoteLottie$lambda$12));
            }
            LottieCompositionSpec lottieCompositionSpec = lottieCompositionSpecM9176boximpl;
            composerStartRestartGroup.endReplaceGroup();
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(lottieCompositionSpec, null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieComposition lottieCompositionSduiRemoteLottie$lambda$4 = SduiRemoteLottie$lambda$4(lottieCompositionResultRememberLottieComposition);
            Boolean should_auto_play = component.getShould_auto_play();
            boolean zBooleanValue = should_auto_play != null ? should_auto_play.booleanValue() : true;
            int i3 = component.getShould_loop() ? Integer.MAX_VALUE : 1;
            Float start_position = component.getStart_position();
            if (start_position != null) {
                float fFloatValue = start_position.floatValue();
                if (0.0f > fFloatValue || fFloatValue > 1.0f) {
                    start_position = null;
                }
                LottieClipSpec.Progress progress = start_position != null ? new LottieClipSpec.Progress(start_position.floatValue(), 1.0f) : null;
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionSduiRemoteLottie$lambda$4, zBooleanValue, false, false, progress, 0.0f, i3, null, false, false, composerStartRestartGroup, LottieClipSpec.Progress.$stable << 12, 940);
                composerStartRestartGroup.startReplaceGroup(1246158207);
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                Map<String, String> animation_text_mapping = component.getAnimation_text_mapping();
                composerStartRestartGroup.startReplaceGroup(1246160136);
                if (animation_text_mapping != null) {
                    Typeface font = ContextsUiExtensions.getFont((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), C16915R.font.capsule_sans_medium);
                    composerStartRestartGroup.startReplaceGroup(1147263075);
                    for (Tuples2 tuples2 : MapsKt.toList(animation_text_mapping)) {
                        String[] strArr = {"**", (String) tuples2.component1()};
                        listCreateListBuilder.add(LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TEXT, (String) tuples2.component2(), (String[]) Arrays.copyOf(strArr, 2), composerStartRestartGroup, 6));
                        listCreateListBuilder.add(LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.TYPEFACE, font, (String[]) Arrays.copyOf(strArr, 2), composerStartRestartGroup, 6));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                Map<String, ThemedColor> color_overrides = component.getColor_overrides();
                List list = color_overrides != null ? MapsKt.toList(color_overrides) : null;
                composerStartRestartGroup.startReplaceGroup(1246188143);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ThemedColor themedColor = (ThemedColor) ((Tuples2) it.next()).component2();
                        Integer num = LottieProperty.COLOR;
                        Color composeColor = SduiColors2.toComposeColor(themedColor, composerStartRestartGroup, 0);
                        listCreateListBuilder.add(LottieDynamicProperties2.rememberLottieDynamicProperty(num, composeColor != null ? Integer.valueOf(Color2.m6735toArgb8_81llA(composeColor.getValue())) : null, new String[]{"**"}, composerStartRestartGroup, 6));
                        Integer num2 = LottieProperty.STROKE_COLOR;
                        Color composeColor2 = SduiColors2.toComposeColor(themedColor, composerStartRestartGroup, 0);
                        listCreateListBuilder.add(LottieDynamicProperties2.rememberLottieDynamicProperty(num2, composeColor2 != null ? Integer.valueOf(Color2.m6735toArgb8_81llA(composeColor2.getValue())) : null, new String[]{"**"}, composerStartRestartGroup, 6));
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                List listBuild = CollectionsKt.build(listCreateListBuilder);
                composerStartRestartGroup.endReplaceGroup();
                LottieDynamicProperties3[] lottieDynamicProperties3Arr = (LottieDynamicProperties3[]) listBuild.toArray(new LottieDynamicProperties3[0]);
                LottieDynamicProperties lottieDynamicPropertiesRememberLottieDynamicProperties = LottieDynamicProperties2.rememberLottieDynamicProperties((LottieDynamicProperties3[]) Arrays.copyOf(lottieDynamicProperties3Arr, lottieDynamicProperties3Arr.length), composerStartRestartGroup, LottieDynamicProperties3.$stable);
                Modifier modifierAspectRatio = AspectRatio3.aspectRatio(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 1 / component.getAspect_ratio(), true);
                LottieComposition lottieCompositionSduiRemoteLottie$lambda$42 = SduiRemoteLottie$lambda$4(lottieCompositionResultRememberLottieComposition);
                ContentScale fit = ContentScale.INSTANCE.getFit();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiRemoteLottie2.SduiRemoteLottie$lambda$7(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionSduiRemoteLottie$lambda$42, (Function0) objRememberedValue3, modifierAspectRatio, false, false, false, null, false, lottieDynamicPropertiesRememberLottieDynamicProperties, null, fit, false, false, null, null, false, composerStartRestartGroup, LottieDynamicProperties.$stable << 24, 6, 64248);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiRemoteLottie2.SduiRemoteLottie$lambda$14(component, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String SduiRemoteLottie$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String SduiRemoteLottie$lambda$16(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final LottieComposition SduiRemoteLottie$lambda$19(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SduiRemoteLottie$lambda$21(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition SduiRemoteLottie$lambda$4(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SduiRemoteLottie$lambda$7(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiRemoteLottie(final LottieDto component, final Modifier modifier, Composer composer, final int i) {
        int i2;
        String dark_mode_content_url;
        LottieCompositionSpec lottieCompositionSpecM9176boximpl;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1696821554);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(component) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1696821554, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottie (SduiRemoteLottie.kt:148)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            MicrogramResourceLoader microgramResourceLoader = (MicrogramResourceLoader) composerStartRestartGroup.consume(MicrogramResourceLoader2.getLocalMicrogramResourceLoader());
            if (((SduiColors) composerStartRestartGroup.consume(SduiColors3.getLocalSduiColors())).isDay(composerStartRestartGroup, 0)) {
                dark_mode_content_url = component.getLight_mode_content_url();
            } else {
                dark_mode_content_url = component.getDark_mode_content_url();
            }
            composerStartRestartGroup.startReplaceGroup(1442072064);
            if (!StringsKt.startsWith$default(dark_mode_content_url, "http", false, 2, (Object) null)) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(microgramResourceLoader) | composerStartRestartGroup.changed(dark_mode_content_url);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SduiRemoteLottie4(microgramResourceLoader, dark_mode_content_url, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dark_mode_content_url, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strSduiRemoteLottie$lambda$16 = SduiRemoteLottie$lambda$16(snapshotState);
            if (strSduiRemoteLottie$lambda$16 != null && strSduiRemoteLottie$lambda$16.length() != 0) {
                String strSduiRemoteLottie$lambda$162 = SduiRemoteLottie$lambda$16(snapshotState);
                if (strSduiRemoteLottie$lambda$162 == null) {
                    strSduiRemoteLottie$lambda$162 = "";
                }
                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.JsonString.m9164boximpl(LottieCompositionSpec.JsonString.m9165constructorimpl(strSduiRemoteLottie$lambda$162));
            } else {
                lottieCompositionSpecM9176boximpl = LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(dark_mode_content_url));
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(lottieCompositionSpecM9176boximpl, null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieComposition lottieCompositionSduiRemoteLottie$lambda$19 = SduiRemoteLottie$lambda$19(lottieCompositionResultRememberLottieComposition);
            Boolean should_auto_play = component.getShould_auto_play();
            boolean zBooleanValue = should_auto_play != null ? should_auto_play.booleanValue() : true;
            int i3 = component.getShould_loop() ? Integer.MAX_VALUE : 1;
            Float start_position = component.getStart_position();
            if (start_position != null) {
                float fFloatValue = start_position.floatValue();
                LottieClipSpec.Progress progress = (0.0f > fFloatValue || fFloatValue > 1.0f) ? null : new LottieClipSpec.Progress(fFloatValue, 1.0f);
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionSduiRemoteLottie$lambda$19, zBooleanValue, false, false, progress, 0.0f, i3, null, false, false, composerStartRestartGroup, LottieClipSpec.Progress.$stable << 12, 940);
                Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 1 / component.getAspect_ratio(), false, 2, null);
                LottieComposition lottieCompositionSduiRemoteLottie$lambda$192 = SduiRemoteLottie$lambda$19(lottieCompositionResultRememberLottieComposition);
                ContentScale fit = ContentScale.INSTANCE.getFit();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(SduiRemoteLottie2.SduiRemoteLottie$lambda$21(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionSduiRemoteLottie$lambda$192, (Function0) objRememberedValue3, modifierAspectRatio$default, false, false, false, null, false, null, null, fit, false, false, null, null, false, composerStartRestartGroup, 0, 6, 64504);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiRemoteLottieKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiRemoteLottie2.SduiRemoteLottie$lambda$24(component, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
