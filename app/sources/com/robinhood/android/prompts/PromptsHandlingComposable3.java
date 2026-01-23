package com.robinhood.android.prompts;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.maps.StyleableMapComposable3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.prompts.PromptsHandlingComposable3;
import com.robinhood.android.prompts.PromptsHandlingEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import com.robinhood.shared.security.prompts.C39672R;
import com.robinhood.time.android.format.DurationFormatter2;
import com.robinhood.utils.compose.LocalActivity3;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Instant;

/* compiled from: PromptsHandlingComposable.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\u001aW\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a£\u0001\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00182\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\tH\u0001¢\u0006\u0002\u0010*\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0012\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u008e\u0002"}, m3636d2 = {"AttemptAnimationTestTag", "", "getAttemptAnimationTestTag$annotations", "()V", "LoginMapLocationTestTag", "getLoginMapLocationTestTag$annotations", "PromptsChallengeLoadingTestTag", "getPromptsChallengeLoadingTestTag$annotations", "PromptsHandlingComposable", "", "handlingInfo", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "duxo", "Lcom/robinhood/android/prompts/PromptsHandlingDuxo;", "requestBiometrics", "Lkotlin/Function0;", "showDeniedBottomSheet", "showNextChallenge", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;Lcom/robinhood/android/prompts/PromptsHandlingDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PromptsHandlingScreen", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;", "eventFlow", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "denyChallenge", "onFinish", "onError", "", "(Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AttemptAnimation", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Map", "locations", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo$Location;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PromptsHandlingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-prompts_externalDebug", "viewState", "event", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "", "mapLoaded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PromptsHandlingComposable3 {
    public static final String AttemptAnimationTestTag = "attemptAnimation";
    public static final String LoginMapLocationTestTag = "loginMapLocation";
    public static final String PromptsChallengeLoadingTestTag = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttemptAnimation$lambda$13(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AttemptAnimation(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Map$lambda$22(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Map(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromptsHandlingComposable$lambda$4(PromptsHandlingInfo promptsHandlingInfo, PromptsHandlingDuxo promptsHandlingDuxo, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromptsHandlingComposable(promptsHandlingInfo, promptsHandlingDuxo, function0, function02, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromptsHandlingScreen$lambda$8(PromptsHandlingInfo promptsHandlingInfo, StateFlow stateFlow, StateFlow stateFlow2, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromptsHandlingScreen(promptsHandlingInfo, stateFlow, stateFlow2, function0, function02, function1, function03, function04, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromptsHandlingScreenPreview$lambda$24(int i, Composer composer, int i2) {
        PromptsHandlingScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getAttemptAnimationTestTag$annotations() {
    }

    public static /* synthetic */ void getLoginMapLocationTestTag$annotations() {
    }

    public static /* synthetic */ void getPromptsChallengeLoadingTestTag$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AttemptAnimation$lambda$10(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition AttemptAnimation$lambda$9(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Map$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final PromptsHandlingViewState PromptsHandlingScreen$lambda$5(SnapshotState4<PromptsHandlingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PromptsHandlingEvent> PromptsHandlingScreen$lambda$6(SnapshotState4<Event<PromptsHandlingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptsHandlingComposable(final PromptsHandlingInfo handlingInfo, final PromptsHandlingDuxo duxo, final Function0<Unit> requestBiometrics, final Function0<Unit> showDeniedBottomSheet, final Function1<? super PromptsHandlingInfo, Unit> showNextChallenge, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final FragmentActivity fragmentActivity;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(handlingInfo, "handlingInfo");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(requestBiometrics, "requestBiometrics");
        Intrinsics.checkNotNullParameter(showDeniedBottomSheet, "showDeniedBottomSheet");
        Intrinsics.checkNotNullParameter(showNextChallenge, "showNextChallenge");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1622484945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(handlingInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(requestBiometrics) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showDeniedBottomSheet) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showNextChallenge) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1622484945, i3, -1, "com.robinhood.android.prompts.PromptsHandlingComposable (PromptsHandlingComposable.kt:94)");
                }
                fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                StateFlow<PromptsHandlingViewState> stateFlow = duxo.getStateFlow();
                int i5 = i3;
                StateFlow<Event<PromptsHandlingEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PromptsHandlingComposable5(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivity);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PromptsHandlingComposable6(fragmentActivity);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(fragmentActivity);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PromptsHandlingComposable3.PromptsHandlingComposable$lambda$3$lambda$2(fragmentActivity, (Throwable) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i5 & 14;
                int i7 = i5 << 3;
                PromptsHandlingScreen(handlingInfo, stateFlow, eventFlow, requestBiometrics, showDeniedBottomSheet, showNextChallenge, function0, function02, (Function1) objRememberedValue3, WindowInsetsPadding_androidKt.systemBarsPadding(modifier4), composerStartRestartGroup, (i7 & 7168) | i6 | (57344 & i7) | (458752 & i7), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PromptsHandlingComposable3.PromptsHandlingComposable$lambda$4(handlingInfo, duxo, requestBiometrics, showDeniedBottomSheet, showNextChallenge, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
            StateFlow<PromptsHandlingViewState> stateFlow2 = duxo.getStateFlow();
            int i52 = i3;
            StateFlow<Event<PromptsHandlingEvent>> eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new PromptsHandlingComposable5(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Function0 function03 = (Function0) ((KFunction) objRememberedValue);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivity);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new PromptsHandlingComposable6(fragmentActivity);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function022 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(fragmentActivity);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PromptsHandlingComposable3.PromptsHandlingComposable$lambda$3$lambda$2(fragmentActivity, (Throwable) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        int i62 = i52 & 14;
                        int i72 = i52 << 3;
                        PromptsHandlingScreen(handlingInfo, stateFlow2, eventFlow2, requestBiometrics, showDeniedBottomSheet, showNextChallenge, function03, function022, (Function1) objRememberedValue3, WindowInsetsPadding_androidKt.systemBarsPadding(modifier4), composerStartRestartGroup, (i72 & 7168) | i62 | (57344 & i72) | (458752 & i72), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromptsHandlingComposable$lambda$3$lambda$2(FragmentActivity fragmentActivity, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, fragmentActivity, throwable, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptsHandlingScreen(final PromptsHandlingInfo handlingInfo, final StateFlow<PromptsHandlingViewState> stateFlow, final StateFlow<Event<PromptsHandlingEvent>> eventFlow, final Function0<Unit> requestBiometrics, final Function0<Unit> showDeniedBottomSheet, final Function1<? super PromptsHandlingInfo, Unit> showNextChallenge, final Function0<Unit> denyChallenge, final Function0<Unit> onFinish, final Function1<? super Throwable, Unit> onError, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Event<PromptsHandlingEvent> event;
        final Event<PromptsHandlingEvent> eventPromptsHandlingScreen$lambda$6;
        Composer composer2;
        final Modifier modifier3;
        EventConsumer<PromptsHandlingEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(handlingInfo, "handlingInfo");
        Intrinsics.checkNotNullParameter(stateFlow, "stateFlow");
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        Intrinsics.checkNotNullParameter(requestBiometrics, "requestBiometrics");
        Intrinsics.checkNotNullParameter(showDeniedBottomSheet, "showDeniedBottomSheet");
        Intrinsics.checkNotNullParameter(showNextChallenge, "showNextChallenge");
        Intrinsics.checkNotNullParameter(denyChallenge, "denyChallenge");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-187818263);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(handlingInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(stateFlow) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventFlow) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(requestBiometrics) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showDeniedBottomSheet) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showNextChallenge) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(denyChallenge) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFinish) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 67108864 : 33554432;
        }
        int i4 = i2 & 512;
        if (i4 == 0) {
            if ((805306368 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-187818263, i3, -1, "com.robinhood.android.prompts.PromptsHandlingScreen (PromptsHandlingComposable.kt:124)");
                }
                final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(stateFlow, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i3 >> 3) & 14, 7);
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PromptsHandlingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof PromptsHandlingEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<PromptsHandlingEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof PromptsHandlingEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventPromptsHandlingScreen$lambda$6 = PromptsHandlingScreen$lambda$6(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPromptsHandlingScreen$lambda$6 == null && (eventPromptsHandlingScreen$lambda$6.getData() instanceof PromptsHandlingEvent) && (eventConsumerInvoke = eventPromptsHandlingScreen$lambda$6.getGetEventConsumer().invoke()) != null) {
                    composer2 = composerStartRestartGroup;
                    eventConsumerInvoke.consume(eventPromptsHandlingScreen$lambda$6, new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m17768invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m17768invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            PromptsHandlingEvent promptsHandlingEvent = (PromptsHandlingEvent) eventPromptsHandlingScreen$lambda$6.getData();
                            if (promptsHandlingEvent instanceof PromptsHandlingEvent.Finished) {
                                onFinish.invoke();
                                return;
                            }
                            if (promptsHandlingEvent instanceof PromptsHandlingEvent.Error) {
                                onError.invoke(((PromptsHandlingEvent.Error) promptsHandlingEvent).getThrowable());
                                return;
                            }
                            if (promptsHandlingEvent instanceof PromptsHandlingEvent.RequestBiometrics) {
                                requestBiometrics.invoke();
                            } else if (promptsHandlingEvent instanceof PromptsHandlingEvent.ShowDeniedBottomSheet) {
                                showDeniedBottomSheet.invoke();
                            } else {
                                if (!(promptsHandlingEvent instanceof PromptsHandlingEvent.ShowNextChallenge)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                showNextChallenge.invoke(((PromptsHandlingEvent.ShowNextChallenge) promptsHandlingEvent).getHandlingInfo());
                            }
                        }
                    });
                } else {
                    composer2 = composerStartRestartGroup;
                }
                final Modifier modifier5 = modifier4;
                Composer composer3 = composer2;
                LocalShowPlaceholder.Loadable(PromptsHandlingScreen$lambda$5(snapshotState4CollectAsStateWithLifecycle).isLoading(), !PromptsHandlingScreen$lambda$5(snapshotState4CollectAsStateWithLifecycle).isLoading() ? TestTag3.testTag(Modifier.INSTANCE, "loading") : Modifier.INSTANCE, null, ComposableLambda3.rememberComposableLambda(-1296617351, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt.PromptsHandlingScreen.2
                    public final void invoke(Composer composer4, int i5) {
                        List<PromptsHandlingInfo.Location> list;
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1296617351, i5, -1, "com.robinhood.android.prompts.PromptsHandlingScreen.<anonymous> (PromptsHandlingComposable.kt:144)");
                        }
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM());
                        PromptsHandlingInfo promptsHandlingInfo = handlingInfo;
                        Resources resources2 = resources;
                        Function0<Unit> function0 = denyChallenge;
                        Function0<Unit> function02 = requestBiometrics;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer4, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        List<PromptsHandlingInfo.Location> mapCoordinates = promptsHandlingInfo.getMapCoordinates();
                        if (!promptsHandlingInfo.getShowMap() || (list = mapCoordinates) == null || list.isEmpty()) {
                            composer4.startReplaceGroup(767836705);
                            PromptsHandlingComposable3.AttemptAnimation(AspectRatio3.aspectRatio$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, PromptsHandlingComposable3.AttemptAnimationTestTag), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(767508012);
                            PromptsHandlingComposable3.Map(extensions2.toImmutableList(mapCoordinates), AspectRatio3.aspectRatio$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, PromptsHandlingComposable3.LoginMapLocationTestTag), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer4, 0);
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i6).m21595getXsmallD9Ej5fM(), 7, null);
                        String titleMarkdown = promptsHandlingInfo.getTitleMarkdown();
                        if (titleMarkdown == null) {
                            titleMarkdown = promptsHandlingInfo.getTitle();
                        }
                        String str = titleMarkdown;
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i6).getDisplayCapsuleMedium();
                        int i7 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(displayCapsuleMedium, iM7919getCentere0LSkKk, 0L, 0L, false, composer4, i7 << 15, 28);
                        int i8 = MarkdownStyle.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, i8 << 6, 24);
                        String bodyMarkdown = promptsHandlingInfo.getBodyMarkdown();
                        if (bodyMarkdown == null) {
                            bodyMarkdown = promptsHandlingInfo.getBody();
                        }
                        BentoMarkdownText2.BentoMarkdownText(bodyMarkdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer4, i6).getTextM(), companion3.m7919getCentere0LSkKk(), 0L, 0L, false, composer4, i7 << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, i8 << 6, 26);
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer4, 0);
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i6).m21372getBg20d7_KjU(), null, 2, null);
                        BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(Intrinsics.areEqual(promptsHandlingInfo.getDeviceType(), ApiTrustedDevice.Type.MOBILE.getServerValue()) ? ServerToBentoAssetMapper3.PHONE : ServerToBentoAssetMapper3.DESKTOP, null, null, 6, null);
                        String deviceName = promptsHandlingInfo.getDeviceName();
                        String location = promptsHandlingInfo.getLocation();
                        Instant actionTime = promptsHandlingInfo.getActionTime();
                        Intrinsics.checkNotNull(resources2);
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM4872backgroundbw27NRU$default, pictogramPog, deviceName, location + " · " + DurationFormatter2.formatWeekDuration(actionTime, resources2), null, null, null, false, false, false, 0L, null, composer4, (BentoBaseRowState.Start.PictogramPog.$stable << 3) | 12582912, 0, 3952);
                        BentoButtonKt.m20586BentoButtonEikTQX8(promptsHandlingInfo.getShowMap() ? function0 : function02, StringResources_androidKt.stringResource(promptsHandlingInfo.getShowMap() ? C25942R.string.prompts_challenge_deny_suspicious_btn_label : C25942R.string.prompts_challenge_approve_btn_label, composer4, 0), ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.APPROVE, null, null, null, 59, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer4, 24576, 0, 8168);
                        BentoButtonKt.m20586BentoButtonEikTQX8(promptsHandlingInfo.getShowMap() ? function02 : function0, StringResources_androidKt.stringResource(promptsHandlingInfo.getShowMap() ? C25942R.string.prompts_challenge_approve_btn_label : C25942R.string.prompts_challenge_deny_btn_label, composer4, 0), ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DENY, null, null, null, 59, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer4, 24576, 0, 8168);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer3, 3072, 4);
                composerStartRestartGroup = composer3;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PromptsHandlingComposable3.PromptsHandlingScreen$lambda$8(handlingInfo, stateFlow, eventFlow, requestBiometrics, showDeniedBottomSheet, showNextChallenge, denyChallenge, onFinish, onError, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 805306368;
        modifier2 = modifier;
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(stateFlow, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, (i3 >> 3) & 14, 7);
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PromptsHandlingComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof PromptsHandlingEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            Event<PromptsHandlingEvent> value2 = eventFlow.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof PromptsHandlingEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            eventPromptsHandlingScreen$lambda$6 = PromptsHandlingScreen$lambda$6(snapshotState4CollectAsStateWithLifecycle22);
            if (eventPromptsHandlingScreen$lambda$6 == null) {
                composer2 = composerStartRestartGroup;
                final Modifier modifier52 = modifier4;
                Composer composer32 = composer2;
                LocalShowPlaceholder.Loadable(PromptsHandlingScreen$lambda$5(snapshotState4CollectAsStateWithLifecycle3).isLoading(), !PromptsHandlingScreen$lambda$5(snapshotState4CollectAsStateWithLifecycle3).isLoading() ? TestTag3.testTag(Modifier.INSTANCE, "loading") : Modifier.INSTANCE, null, ComposableLambda3.rememberComposableLambda(-1296617351, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt.PromptsHandlingScreen.2
                    public final void invoke(Composer composer4, int i5) {
                        List<PromptsHandlingInfo.Location> list;
                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1296617351, i5, -1, "com.robinhood.android.prompts.PromptsHandlingScreen.<anonymous> (PromptsHandlingComposable.kt:144)");
                        }
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier52, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i6).m21593getSmallD9Ej5fM());
                        PromptsHandlingInfo promptsHandlingInfo = handlingInfo;
                        Resources resources22 = resources2;
                        Function0<Unit> function0 = denyChallenge;
                        Function0<Unit> function02 = requestBiometrics;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer4, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        List<PromptsHandlingInfo.Location> mapCoordinates = promptsHandlingInfo.getMapCoordinates();
                        if (!promptsHandlingInfo.getShowMap() || (list = mapCoordinates) == null || list.isEmpty()) {
                            composer4.startReplaceGroup(767836705);
                            PromptsHandlingComposable3.AttemptAnimation(AspectRatio3.aspectRatio$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, PromptsHandlingComposable3.AttemptAnimationTestTag), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(767508012);
                            PromptsHandlingComposable3.Map(extensions2.toImmutableList(mapCoordinates), AspectRatio3.aspectRatio$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(Modifier.INSTANCE, PromptsHandlingComposable3.LoginMapLocationTestTag), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer4, 0);
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i6).m21595getXsmallD9Ej5fM(), 7, null);
                        String titleMarkdown = promptsHandlingInfo.getTitleMarkdown();
                        if (titleMarkdown == null) {
                            titleMarkdown = promptsHandlingInfo.getTitle();
                        }
                        String str = titleMarkdown;
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer4, i6).getDisplayCapsuleMedium();
                        int i7 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(displayCapsuleMedium, iM7919getCentere0LSkKk, 0L, 0L, false, composer4, i7 << 15, 28);
                        int i8 = MarkdownStyle.$stable;
                        BentoMarkdownText2.BentoMarkdownText(str, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, i8 << 6, 24);
                        String bodyMarkdown = promptsHandlingInfo.getBodyMarkdown();
                        if (bodyMarkdown == null) {
                            bodyMarkdown = promptsHandlingInfo.getBody();
                        }
                        BentoMarkdownText2.BentoMarkdownText(bodyMarkdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer4, i6).getTextM(), companion3.m7919getCentere0LSkKk(), 0L, 0L, false, composer4, i7 << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer4, i8 << 6, 26);
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer4, 0);
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer4, i6).m21372getBg20d7_KjU(), null, 2, null);
                        BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(Intrinsics.areEqual(promptsHandlingInfo.getDeviceType(), ApiTrustedDevice.Type.MOBILE.getServerValue()) ? ServerToBentoAssetMapper3.PHONE : ServerToBentoAssetMapper3.DESKTOP, null, null, 6, null);
                        String deviceName = promptsHandlingInfo.getDeviceName();
                        String location = promptsHandlingInfo.getLocation();
                        Instant actionTime = promptsHandlingInfo.getActionTime();
                        Intrinsics.checkNotNull(resources22);
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierM4872backgroundbw27NRU$default, pictogramPog, deviceName, location + " · " + DurationFormatter2.formatWeekDuration(actionTime, resources22), null, null, null, false, false, false, 0L, null, composer4, (BentoBaseRowState.Start.PictogramPog.$stable << 3) | 12582912, 0, 3952);
                        BentoButtonKt.m20586BentoButtonEikTQX8(promptsHandlingInfo.getShowMap() ? function0 : function02, StringResources_androidKt.stringResource(promptsHandlingInfo.getShowMap() ? C25942R.string.prompts_challenge_deny_suspicious_btn_label : C25942R.string.prompts_challenge_approve_btn_label, composer4, 0), ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.APPROVE, null, null, null, 59, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer4, 24576, 0, 8168);
                        BentoButtonKt.m20586BentoButtonEikTQX8(promptsHandlingInfo.getShowMap() ? function02 : function0, StringResources_androidKt.stringResource(promptsHandlingInfo.getShowMap() ? C25942R.string.prompts_challenge_approve_btn_label : C25942R.string.prompts_challenge_deny_btn_label, composer4, 0), ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM(), 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DENY, null, null, null, 59, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer4, 24576, 0, 8168);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer32, 3072, 4);
                composerStartRestartGroup = composer32;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AttemptAnimation(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1364379094);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364379094, i3, -1, "com.robinhood.android.prompts.AttemptAnimation (PromptsHandlingComposable.kt:252)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C39672R.raw.lottie_prompts_attempt)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            int i5 = i3;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(AttemptAnimation$lambda$9(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            LottieComposition lottieCompositionAttemptAnimation$lambda$9 = AttemptAnimation$lambda$9(lottieCompositionResultRememberLottieComposition);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(PromptsHandlingComposable3.AttemptAnimation$lambda$10(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            LottieAnimation2.LottieAnimation(lottieCompositionAttemptAnimation$lambda$9, (Function0) objRememberedValue, modifier2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i5 << 6) & 896, 0, 65528);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromptsHandlingComposable3.AttemptAnimation$lambda$13(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Map(final ImmutableList<PromptsHandlingInfo.Location> immutableList, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final LatLng latLng;
        CameraPositionState cameraPositionState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1595792275);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1595792275, i3, -1, "com.robinhood.android.prompts.Map (PromptsHandlingComposable.kt:270)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingComposable3.Map$lambda$15$lambda$14();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                latLng = new LatLng(((PromptsHandlingInfo.Location) CollectionsKt.first((List) immutableList)).getLatitude(), ((PromptsHandlingInfo.Location) CollectionsKt.first((List) immutableList)).getLongitude());
                final Function1 function1 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PromptsHandlingComposable3.Map$lambda$18(latLng, (CameraPositionState) obj);
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-1911106014);
                cameraPositionState = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$Map$$inlined$rememberCameraPositionState$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final CameraPositionState invoke() {
                        CameraPositionState cameraPositionState2 = new CameraPositionState(null, 1, null);
                        function1.invoke(cameraPositionState2);
                        return cameraPositionState2;
                    }
                }, composerStartRestartGroup, 72, 0);
                composerStartRestartGroup.endReplaceableGroup();
                Boolean boolValueOf = Boolean.valueOf(Map$lambda$16(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(cameraPositionState) | composerStartRestartGroup.changedInstance(latLng);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new PromptsHandlingComposable4(cameraPositionState, latLng, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierClip = Clip.clip(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()));
                MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingComposable3.Map$lambda$21$lambda$20(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                StyleableMapComposable3.StyleableMapComposable(modifierClip, cameraPositionState, null, null, null, null, mapUiSettings, null, null, null, (Function0) objRememberedValue3, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(1221672891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt.Map.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1221672891, i5, -1, "com.robinhood.android.prompts.Map.<anonymous> (PromptsHandlingComposable.kt:307)");
                        }
                        MarkerKt.m9323MarkerComposableKhg_OnI(new Object[0], MarkerKt.rememberMarkerState(null, latLng, composer2, 0, 1), null, 0.0f, 0L, false, false, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, PromptsHandlingComposable.INSTANCE.getLambda$52790920$feature_prompts_externalDebug(), composer2, (MarkerState.$stable << 3) | 1769472, 100663296, 262044);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (CameraPositionState.$stable << 3) | (MapUiSettings.$stable << 18), 1572864, 64444);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PromptsHandlingComposable3.Map$lambda$22(immutableList, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            latLng = new LatLng(((PromptsHandlingInfo.Location) CollectionsKt.first((List) immutableList)).getLatitude(), ((PromptsHandlingInfo.Location) CollectionsKt.first((List) immutableList)).getLongitude());
            final Function1 function12 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PromptsHandlingComposable3.Map$lambda$18(latLng, (CameraPositionState) obj);
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-1911106014);
            cameraPositionState = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$Map$$inlined$rememberCameraPositionState$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CameraPositionState invoke() {
                    CameraPositionState cameraPositionState2 = new CameraPositionState(null, 1, null);
                    function12.invoke(cameraPositionState2);
                    return cameraPositionState2;
                }
            }, composerStartRestartGroup, 72, 0);
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf2 = Boolean.valueOf(Map$lambda$16(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(cameraPositionState) | composerStartRestartGroup.changedInstance(latLng);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new PromptsHandlingComposable4(cameraPositionState, latLng, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                Modifier modifierClip2 = Clip.clip(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.0f, false, 2, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()));
                MapUiSettings mapUiSettings2 = new MapUiSettings(false, false, false, false, false, false, false, false, false, false);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingComposable3.Map$lambda$21$lambda$20(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    StyleableMapComposable3.StyleableMapComposable(modifierClip2, cameraPositionState, null, null, null, null, mapUiSettings2, null, null, null, (Function0) objRememberedValue3, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(1221672891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt.Map.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1221672891, i5, -1, "com.robinhood.android.prompts.Map.<anonymous> (PromptsHandlingComposable.kt:307)");
                            }
                            MarkerKt.m9323MarkerComposableKhg_OnI(new Object[0], MarkerKt.rememberMarkerState(null, latLng, composer2, 0, 1), null, 0.0f, 0L, false, false, 0L, 0.0f, null, null, null, false, 0.0f, null, null, null, null, PromptsHandlingComposable.INSTANCE.getLambda$52790920$feature_prompts_externalDebug(), composer2, (MarkerState.$stable << 3) | 1769472, 100663296, 262044);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (CameraPositionState.$stable << 3) | (MapUiSettings.$stable << 18), 1572864, 64444);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState Map$lambda$15$lambda$14() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void Map$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Map$lambda$18(LatLng latLng, CameraPositionState rememberCameraPositionState) {
        Intrinsics.checkNotNullParameter(rememberCameraPositionState, "$this$rememberCameraPositionState");
        CameraPosition cameraPositionFromLatLngZoom = CameraPosition.fromLatLngZoom(latLng, 15.0f);
        Intrinsics.checkNotNullExpressionValue(cameraPositionFromLatLngZoom, "fromLatLngZoom(...)");
        rememberCameraPositionState.setPosition(cameraPositionFromLatLngZoom);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Map$lambda$21$lambda$20(SnapshotState snapshotState) {
        Map$lambda$17(snapshotState, true);
        return Unit.INSTANCE;
    }

    public static final void PromptsHandlingScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1032601858);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1032601858, i, -1, "com.robinhood.android.prompts.PromptsHandlingScreenPreview (PromptsHandlingComposable.kt:323)");
            }
            final PromptsHandlingViewState promptsHandlingViewState = new PromptsHandlingViewState(true);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PromptsHandlingComposable7(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            companion.init(US, (Function1) ((KFunction) objRememberedValue));
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(-1617960386, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt.PromptsHandlingScreenPreview.2

                /* compiled from: PromptsHandlingComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PromptsHandlingViewState $viewState;

                    AnonymousClass1(PromptsHandlingViewState promptsHandlingViewState) {
                        this.$viewState = promptsHandlingViewState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1567558778, i, -1, "com.robinhood.android.prompts.PromptsHandlingScreenPreview.<anonymous>.<anonymous> (PromptsHandlingComposable.kt:334)");
                        }
                        UUID uuid = new UUID(0L, 0L);
                        Instant EPOCH = Instant.EPOCH;
                        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
                        PromptsHandlingInfo promptsHandlingInfo = new PromptsHandlingInfo(uuid, "some-flow", "Banana Phone", "It ain't a pony", "It's no baloney", EPOCH, false, "It grows in bunches", "I've got my hunches. It's the best! Beats the rest! Cellular, modular, interactive-odular!", "It grows in bunches", "I've got my hunches. It's the best! Beats the rest! Cellular, modular, interactive-odular!", false, null);
                        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(this.$viewState);
                        StateFlow2 stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PromptsHandlingComposable3.C259292.AnonymousClass1.invoke$lambda$5$lambda$4((PromptsHandlingInfo) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function1 function1 = (Function1) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function03 = (Function0) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        Function0 function04 = (Function0) objRememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$2$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PromptsHandlingComposable3.C259292.AnonymousClass1.invoke$lambda$11$lambda$10((Throwable) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        PromptsHandlingComposable3.PromptsHandlingScreen(promptsHandlingInfo, stateFlow2MutableStateFlow, stateFlow2MutableStateFlow2, function0, function02, function1, function03, function04, (Function1) objRememberedValue6, Modifier.INSTANCE, composer, 920349696, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(PromptsHandlingInfo it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617960386, i2, -1, "com.robinhood.android.prompts.PromptsHandlingScreenPreview.<anonymous> (PromptsHandlingComposable.kt:333)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1567558778, true, new AnonymousClass1(promptsHandlingViewState), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromptsHandlingComposable3.PromptsHandlingScreenPreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
