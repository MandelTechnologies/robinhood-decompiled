package com.robinhood.android.isa.isatransferdetail;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.isa.contracts.IsaTransferDetailKey;
import com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable3;
import com.robinhood.android.isa.isatransferdetail.models.BannerTextComponent;
import com.robinhood.android.isa.isatransferdetail.models.DetailRow;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailEvent;
import com.robinhood.android.isa.isatransferdetail.models.IsaTransferDetailViewState;
import com.robinhood.android.isa.isatransferdetail.models.SpacerHeight;
import com.robinhood.android.isa.isatransferdetail.models.ValueTextStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: IsaTransferDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\bH\u0003¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\bH\u0003¢\u0006\u0002\u0010\t\u001a-\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0002\u0010\u0012\u001ae\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\bH\u0001¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\u0012\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u008a\u0084\u0002"}, m3636d2 = {"CONTACT_SUPPORT_DEEPLINK", "", "TAG_SHIMMER_LOADER", "currentBackPressedAction", "Lkotlin/Function0;", "", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "currentDeeplinkHandler", "Lkotlin/Function1;", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "currentActivityErrorHandler", "", "ScreenContent", "viewState", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "onCancellationRequested", "(Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState$Loaded;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "IsaTransferDetailComposable", "arg", "Lcom/robinhood/android/isa/contracts/IsaTransferDetailKey;", "duxo", "Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailDuxo;", "onBackClick", "openDeeplink", "onError", "(Lcom/robinhood/android/isa/contracts/IsaTransferDetailKey;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/isa/isatransferdetail/IsaTransferDetailDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-isa-transfer-detail_externalDebug", "showCancelDialog", "", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/isa/isatransferdetail/models/IsaTransferDetailEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaTransferDetailComposable3 {
    public static final String CONTACT_SUPPORT_DEEPLINK = "robinhood://contact_support";
    public static final String TAG_SHIMMER_LOADER = "shimmer-loader";

    /* compiled from: IsaTransferDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ValueTextStyle.values().length];
            try {
                iArr[ValueTextStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueTextStyle.BOLD_NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueTextStyle.BOLD_FOREGROUND2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpacerHeight.values().length];
            try {
                iArr2[SpacerHeight.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SpacerHeight.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaTransferDetailComposable$lambda$29(IsaTransferDetailKey isaTransferDetailKey, Modifier modifier, IsaTransferDetailDuxo isaTransferDetailDuxo, Function0 function0, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        IsaTransferDetailComposable(isaTransferDetailKey, modifier, isaTransferDetailDuxo, function0, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$25(IsaTransferDetailViewState.Loaded loaded, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ScreenContent(loaded, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentDeeplinkHandler$lambda$6$lambda$5(Navigator navigator, Context context, String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(uriString), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    private static final Function0<Unit> currentBackPressedAction(Composer composer, int i) {
        KFunction kFunction;
        Function0<Unit> function0;
        composer.startReplaceGroup(962317826);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(962317826, i, -1, "com.robinhood.android.isa.isatransferdetail.currentBackPressedAction (IsaTransferDetailComposable.kt:64)");
        }
        OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
        composer.startReplaceGroup(1369465791);
        if (current == null) {
            kFunction = null;
        } else {
            OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new IsaTransferDetailComposable7(onBackPressedDispatcher);
                composer.updateRememberedValue(objRememberedValue);
            }
            kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (kFunction != null) {
            function0 = (Function0) kFunction;
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("LocalOnBackPressedDispatcherOwner not set"), true, null, 4, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function0;
    }

    private static final Function1<String, Unit> currentDeeplinkHandler(Composer composer, int i) {
        composer.startReplaceGroup(1040910768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1040910768, i, -1, "com.robinhood.android.isa.isatransferdetail.currentDeeplinkHandler (IsaTransferDetailComposable.kt:75)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IsaTransferDetailComposable3.currentDeeplinkHandler$lambda$6$lambda$5(navigator, context, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<String, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsaTransferDetailViewState IsaTransferDetailComposable$lambda$26(SnapshotState4<? extends IsaTransferDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<IsaTransferDetailEvent> IsaTransferDetailComposable$lambda$27(SnapshotState4<Event<IsaTransferDetailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean ScreenContent$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Function1<Throwable, Unit> currentActivityErrorHandler(Composer composer, int i) {
        composer.startReplaceGroup(739447693);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(739447693, i, -1, "com.robinhood.android.isa.isatransferdetail.currentActivityErrorHandler (IsaTransferDetailComposable.kt:85)");
        }
        final Activity activity = (Activity) composer.consume(LocalActivity.getLocalActivity());
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(activity);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IsaTransferDetailComposable3.currentActivityErrorHandler$lambda$9$lambda$8(activity, (Throwable) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<Throwable, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentActivityErrorHandler$lambda$9$lambda$8(Activity activity, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        if (activity != null) {
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, error, false, true, 0, null, 52, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenContent(final IsaTransferDetailViewState.Loaded loaded, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(447406589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(447406589, i3, -1, "com.robinhood.android.isa.isatransferdetail.ScreenContent (IsaTransferDetailComposable.kt:104)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(loaded);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return IsaTransferDetailComposable3.ScreenContent$lambda$18$lambda$17(loaded, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifier5, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i3 >> 3) & 14, 510);
                if (ScreenContent$lambda$11(snapshotState)) {
                    String strStringResource = StringResources_androidKt.stringResource(C19934R.string.cancel_dialog_title, composer2, 0);
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C19934R.string.cancel_dialog_description, composer2, 0));
                    String strStringResource2 = StringResources_androidKt.stringResource(C19934R.string.cancel_dialog_confirm_cta, composer2, 0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean z = (i3 & 896) == 256;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (z || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IsaTransferDetailComposable3.ScreenContent$lambda$20$lambda$19(function0, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue3);
                    String strStringResource3 = StringResources_androidKt.stringResource(C19934R.string.label_go_back, composer2, 0);
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IsaTransferDetailComposable3.ScreenContent$lambda$22$lambda$21(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue4);
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IsaTransferDetailComposable3.ScreenContent$lambda$24$lambda$23(snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function02 = (Function0) objRememberedValue5;
                    composer2.endReplaceGroup();
                    int i5 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                    int i6 = BentoAlertButton.$stable;
                    BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function02, composer2, i5 | (i6 << 6) | (i6 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composer2 = composer2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaTransferDetailComposable3.ScreenContent$lambda$25(loaded, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(loaded);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IsaTransferDetailComposable3.ScreenContent$lambda$18$lambda$17(loaded, snapshotState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifier52, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i3 >> 3) & 14, 510);
                if (ScreenContent$lambda$11(snapshotState)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScreenContent$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$18$lambda$17(IsaTransferDetailViewState.Loaded loaded, final SnapshotState snapshotState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<DetailRow> detailRows = loaded.getDetailRows();
        final C19924x1af45160 c19924x1af45160 = new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$ScreenContent$lambda$18$lambda$17$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DetailRow detailRow) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((DetailRow) obj);
            }
        };
        LazyColumn.items(detailRows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$ScreenContent$lambda$18$lambda$17$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c19924x1af45160.invoke(detailRows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$ScreenContent$lambda$18$lambda$17$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                float fM21590getDefaultD9Ej5fM;
                Color color;
                Color colorM6701boximpl;
                Composer composer2 = composer;
                int i3 = (i2 & 6) == 0 ? i2 | (composer2.changed(lazyItemScope) ? 4 : 2) : i2;
                if ((i2 & 48) == 0) {
                    i3 |= composer2.changed(i) ? 32 : 16;
                }
                if (!composer2.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                DetailRow detailRow = (DetailRow) detailRows.get(i);
                composer2.startReplaceGroup(-2055286992);
                TextStyle textStyleM7655copyp1EtxEg$default = null;
                if (!(detailRow instanceof DetailRow.Banner)) {
                    if (!(detailRow instanceof DetailRow.CancelCta)) {
                        if (detailRow instanceof DetailRow.Divider) {
                            composer2.startReplaceGroup(-2053858327);
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                            composer2.endReplaceGroup();
                        } else if (detailRow instanceof DetailRow.InfoRow) {
                            composer2.startReplaceGroup(-2053579699);
                            DetailRow.InfoRow infoRow = (DetailRow.InfoRow) detailRow;
                            StringResource label = infoRow.getLabel();
                            int i4 = StringResource.$stable;
                            AnnotatedString annotatedString = new AnnotatedString(StringResources6.getTextAsString(label, composer2, i4), null, 2, null);
                            AnnotatedString annotatedString2 = new AnnotatedString(StringResources6.getTextAsString(infoRow.getValue(), composer2, i4), null, 2, null);
                            int i5 = IsaTransferDetailComposable3.WhenMappings.$EnumSwitchMapping$0[infoRow.getValueTextStyle().ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    composer2.startReplaceGroup(-620419763);
                                    long jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21452getNegative0d7_KjU();
                                    composer2.endReplaceGroup();
                                    colorM6701boximpl = Color.m6701boximpl(jM21452getNegative0d7_KjU);
                                } else {
                                    if (i5 != 3) {
                                        composer2.startReplaceGroup(-620425007);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(-620416760);
                                    long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU();
                                    composer2.endReplaceGroup();
                                    colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                                }
                                color = colorM6701boximpl;
                            } else {
                                composer2.startReplaceGroup(-2053229896);
                                composer2.endReplaceGroup();
                                color = null;
                            }
                            ValueTextStyle valueTextStyle = infoRow.getValueTextStyle();
                            composer2.startReplaceGroup(-620413598);
                            if (valueTextStyle != ValueTextStyle.DEFAULT) {
                                if (valueTextStyle != ValueTextStyle.BOLD_NEGATIVE && valueTextStyle != ValueTextStyle.BOLD_FOREGROUND2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                            }
                            TextStyle textStyle = textStyleM7655copyp1EtxEg$default;
                            composer2.endReplaceGroup();
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, color, textStyle, null, null, false, false, 3869, null), null, null, composer2, BentoDataRowState.$stable, 6);
                            composer2.endReplaceGroup();
                        } else if (detailRow instanceof DetailRow.Spacer) {
                            composer2.startReplaceGroup(-2052499256);
                            int i6 = IsaTransferDetailComposable3.WhenMappings.$EnumSwitchMapping$1[((DetailRow.Spacer) detailRow).getHeight().ordinal()];
                            if (i6 == 1) {
                                composer2.startReplaceGroup(-620395316);
                                fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                                composer2.endReplaceGroup();
                            } else {
                                if (i6 != 2) {
                                    composer2.startReplaceGroup(-620397918);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-620392949);
                                fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                                composer2.endReplaceGroup();
                            }
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, fM21590getDefaultD9Ej5fM), composer2, 0);
                            composer2.endReplaceGroup();
                        } else if (detailRow instanceof DetailRow.Subtitle) {
                            composer2.startReplaceGroup(-2052153358);
                            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(((DetailRow.Subtitle) detailRow).getText(), composer2, StringResource.$stable), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        } else if (detailRow instanceof DetailRow.TimelineRow) {
                            composer2.startReplaceGroup(-2051903064);
                            DetailRow.TimelineRow timelineRow = (DetailRow.TimelineRow) detailRow;
                            Timeline.Status status = timelineRow.getStatus();
                            Timeline.Position position = timelineRow.getPosition();
                            StringResource title = timelineRow.getTitle();
                            int i7 = StringResource.$stable;
                            BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, position, StringResources6.getTextAsString(title, composer2, i7), null, null, StringResources6.getTextAsString(timelineRow.getMetadata(), composer2, i7), null, null, null, null, false, null, null, false, false, 0, false, 0, false, false, false, composer, 0, 0, 0, 2097112);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        } else {
                            if (!(detailRow instanceof DetailRow.Title)) {
                                composer2.startReplaceGroup(-620488909);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-2051557786);
                            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(((DetailRow.Title) detailRow).getText(), composer2, StringResource.$stable), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        }
                    } else {
                        composer2.startReplaceGroup(-2054427425);
                        composer2.startReplaceGroup(5004770);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final SnapshotState snapshotState2 = snapshotState;
                            objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$ScreenContent$1$1$1$2$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    IsaTransferDetailComposable3.ScreenContent$lambda$12(snapshotState2, true);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer2.endReplaceGroup();
                        String strStringResource = StringResources_androidKt.stringResource(C19934R.string.cancel_cta_text, composer2, 0);
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, type2, false, false, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21452getNegative0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer2, i8).m21452getNegative0d7_KjU()), null, false, null, composer, 24582, 0, 7400);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(-2055337399);
                    composer2.startReplaceGroup(-620488647);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer2.startReplaceGroup(-620487092);
                    for (BannerTextComponent bannerTextComponent : ((DetailRow.Banner) detailRow).getTextComponents()) {
                        composer2.startReplaceGroup(-620484890);
                        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, bannerTextComponent.isBold() ? FontWeight.INSTANCE.getBold() : null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources6.getTextAsString(bannerTextComponent.getText(), composer2, StringResource.$stable));
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composer2.endReplaceGroup();
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    }
                    composer2.endReplaceGroup();
                    AnnotatedString annotatedString3 = builder.toAnnotatedString();
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString3, null, bentoTheme2.getColors(composer2, i9).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer2, i9).m21372getBg20d7_KjU(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), null, null, null, composer2, 48, 224);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$20$lambda$19(Function0 function0, SnapshotState snapshotState) {
        ScreenContent$lambda$12(snapshotState, false);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$22$lambda$21(SnapshotState snapshotState) {
        ScreenContent$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$24$lambda$23(SnapshotState snapshotState) {
        ScreenContent$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaTransferDetailComposable(final IsaTransferDetailKey arg, Modifier modifier, IsaTransferDetailDuxo isaTransferDetailDuxo, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final IsaTransferDetailDuxo isaTransferDetailDuxo2;
        final Function0<Unit> function0CurrentBackPressedAction;
        Function1<? super String, Unit> function13;
        Function1<? super Throwable, Unit> function14;
        Modifier modifier3;
        int i4;
        Function1<? super String, Unit> function1CurrentDeeplinkHandler;
        int i5;
        final Function1<? super String, Unit> function15;
        final Function1<? super Throwable, Unit> function1CurrentActivityErrorHandler;
        CreationExtras defaultViewModelCreationExtras;
        Event<IsaTransferDetailEvent> event;
        final Event<IsaTransferDetailEvent> eventIsaTransferDetailComposable$lambda$27;
        final Function1<? super String, Unit> function16;
        final Modifier modifier4;
        final IsaTransferDetailDuxo isaTransferDetailDuxo3;
        final Function1<? super Throwable, Unit> function17;
        final Function0<Unit> function02;
        EventConsumer<IsaTransferDetailEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Composer composerStartRestartGroup = composer.startRestartGroup(1920637000);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(arg) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    isaTransferDetailDuxo2 = isaTransferDetailDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(isaTransferDetailDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    isaTransferDetailDuxo2 = isaTransferDetailDuxo;
                }
                i3 |= i7;
            } else {
                isaTransferDetailDuxo2 = isaTransferDetailDuxo;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function0CurrentBackPressedAction = function0;
                    int i8 = composerStartRestartGroup.changedInstance(function0CurrentBackPressedAction) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    function0CurrentBackPressedAction = function0;
                }
                i3 |= i8;
            } else {
                function0CurrentBackPressedAction = function0;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function13 = function1;
                    int i9 = composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    function13 = function1;
                }
                i3 |= i9;
            } else {
                function13 = function1;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    function14 = function12;
                    int i10 = composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    function14 = function12;
                }
                i3 |= i10;
            } else {
                function14 = function12;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IsaTransferDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        isaTransferDetailDuxo2 = (IsaTransferDetailDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = 0;
                    }
                    if ((i2 & 8) != 0) {
                        function0CurrentBackPressedAction = currentBackPressedAction(composerStartRestartGroup, i4);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) == 0) {
                        function1CurrentDeeplinkHandler = currentDeeplinkHandler(composerStartRestartGroup, i4);
                        i3 &= -57345;
                    } else {
                        function1CurrentDeeplinkHandler = function1;
                    }
                    if ((i2 & 32) == 0) {
                        function1CurrentActivityErrorHandler = currentActivityErrorHandler(composerStartRestartGroup, i4);
                        Function1<? super String, Unit> function18 = function1CurrentDeeplinkHandler;
                        i5 = i3 & (-458753);
                        function15 = function18;
                    } else {
                        Function1<? super String, Unit> function19 = function1CurrentDeeplinkHandler;
                        i5 = i3;
                        function15 = function19;
                        function1CurrentActivityErrorHandler = function12;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    Function1<? super String, Unit> function110 = function13;
                    i5 = i3;
                    function15 = function110;
                    modifier3 = modifier2;
                    function1CurrentActivityErrorHandler = function14;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1920637000, i5, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable (IsaTransferDetailComposable.kt:241)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(isaTransferDetailDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<IsaTransferDetailEvent>> eventFlow = isaTransferDetailDuxo2.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IsaTransferDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof IsaTransferDetailEvent) {
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
                Event<IsaTransferDetailEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof IsaTransferDetailEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                eventIsaTransferDetailComposable$lambda$27 = IsaTransferDetailComposable$lambda$27(snapshotState4CollectAsStateWithLifecycle2);
                if (eventIsaTransferDetailComposable$lambda$27 != null && (eventIsaTransferDetailComposable$lambda$27.getData() instanceof IsaTransferDetailEvent.Error) && (eventConsumerInvoke = eventIsaTransferDetailComposable$lambda$27.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventIsaTransferDetailComposable$lambda$27, new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15733invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15733invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            function1CurrentActivityErrorHandler.invoke(((IsaTransferDetailEvent.Error) eventIsaTransferDetailComposable$lambda$27.getData()).getT());
                        }
                    });
                }
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(-2100461564, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2100461564, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:252)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1077094711$feature_isa_transfer_detail_externalDebug = IsaTransferDetailComposable.INSTANCE.getLambda$1077094711$feature_isa_transfer_detail_externalDebug();
                        final Function0<Unit> function03 = function0CurrentBackPressedAction;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1077094711$feature_isa_transfer_detail_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1244605853, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i12) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i12 & 6) == 0) {
                                    i12 |= (i12 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i12 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1244605853, i12, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:255)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer3, (BentoAppBarScope.$stable << 12) | ((i12 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1506972893, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        if ((i11 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1506972893, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:260)");
                        }
                        final BentoButtons.Type typeDecideContactSupportButtonType = IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4CollectAsStateWithLifecycle).decideContactSupportButtonType();
                        if (typeDecideContactSupportButtonType != null) {
                            final SnapshotState4<IsaTransferDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final Function1<String, Unit> function111 = function15;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-82660125, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i12) {
                                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-82660125, i12, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:262)");
                                    }
                                    LocalShowPlaceholder.Loadable(IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4) instanceof IsaTransferDetailViewState.Loading, null, null, ComposableLambda3.rememberComposableLambda(429762163, true, new C199301(function111, typeDecideContactSupportButtonType), composer3, 54), composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: IsaTransferDetailComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1 */
                                static final class C199301 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ BentoButtons.Type $buttonType;
                                    final /* synthetic */ Function1<String, Unit> $openDeeplink;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C199301(Function1<? super String, Unit> function1, BentoButtons.Type type2) {
                                        this.$openDeeplink = function1;
                                        this.$buttonType = type2;
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
                                            ComposerKt.traceEventStart(429762163, i, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:265)");
                                        }
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$openDeeplink);
                                        final Function1<String, Unit> function1 = this.$openDeeplink;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR (r3v2 'objRememberedValue' java.lang.Object) = (r2v2 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m)] (LINE:267) call: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r18
                                                r14 = r19
                                                r1 = r20
                                                r2 = r1 & 3
                                                r3 = 2
                                                if (r2 != r3) goto L16
                                                boolean r2 = r14.getSkipping()
                                                if (r2 != 0) goto L12
                                                goto L16
                                            L12:
                                                r14.skipToGroupEnd()
                                                return
                                            L16:
                                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r2 == 0) goto L25
                                                r2 = -1
                                                java.lang.String r3 = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:265)"
                                                r4 = 429762163(0x199da673, float:1.6300648E-23)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                            L25:
                                                r1 = 5004770(0x4c5de2, float:7.013177E-39)
                                                r14.startReplaceGroup(r1)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r0.$openDeeplink
                                                boolean r1 = r14.changed(r1)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r2 = r0.$openDeeplink
                                                java.lang.Object r3 = r14.rememberedValue()
                                                if (r1 != 0) goto L41
                                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r1 = r1.getEmpty()
                                                if (r3 != r1) goto L49
                                            L41:
                                                com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0
                                                r3.<init>(r2)
                                                r14.updateRememberedValue(r3)
                                            L49:
                                                r1 = r3
                                                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                                r14.endReplaceGroup()
                                                int r2 = com.robinhood.android.common.C11048R.string.general_label_contact_support
                                                r3 = 0
                                                java.lang.String r2 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r2, r14, r3)
                                                androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p011ui.Modifier.INSTANCE
                                                com.robinhood.compose.bento.theme.BentoTheme r4 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                int r5 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                com.robinhood.compose.bento.theme.BentoSpacing r4 = r4.getSpacing(r14, r5)
                                                float r4 = r4.m21590getDefaultD9Ej5fM()
                                                androidx.compose.ui.Modifier r3 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(r3, r4)
                                                com.robinhood.compose.bento.component.BentoButtons$Type r5 = r0.$buttonType
                                                r16 = 0
                                                r17 = 8168(0x1fe8, float:1.1446E-41)
                                                r4 = 0
                                                r6 = 0
                                                r7 = 0
                                                r8 = 0
                                                r9 = 0
                                                r10 = 0
                                                r11 = 0
                                                r12 = 0
                                                r13 = 0
                                                r15 = 0
                                                com.robinhood.compose.bento.component.BentoButtonKt.m20586BentoButtonEikTQX8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto L84
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            L84:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable4.C199301.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
                                            function1.invoke(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, 54), composer2, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(958524825, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i11) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i11 & 6) == 0) {
                                i11 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i11 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(958524825, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:278)");
                            }
                            IsaTransferDetailViewState isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 = IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4CollectAsStateWithLifecycle);
                            if (isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 instanceof IsaTransferDetailViewState.Loading) {
                                composer2.startReplaceGroup(-1824375478);
                                LoadingScreenComposablesKt.GenericLoadingScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), IsaTransferDetailComposable3.TAG_SHIMMER_LOADER), false, composer2, 0, 2);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 instanceof IsaTransferDetailViewState.Loaded)) {
                                    composer2.startReplaceGroup(2019356952);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1824100198);
                                IsaTransferDetailViewState.Loaded loaded = (IsaTransferDetailViewState.Loaded) isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26;
                                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                IsaTransferDetailDuxo isaTransferDetailDuxo4 = isaTransferDetailDuxo2;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer2.changedInstance(isaTransferDetailDuxo4);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new IsaTransferDetailComposable5(isaTransferDetailDuxo4);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                IsaTransferDetailComposable3.ScreenContent(loaded, modifierPadding, (Function0) ((KFunction) objRememberedValue2), composer2, 0, 0);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 504);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    IsaTransferDetailDuxo isaTransferDetailDuxo4 = isaTransferDetailDuxo2;
                    function16 = function15;
                    modifier4 = modifier3;
                    isaTransferDetailDuxo3 = isaTransferDetailDuxo4;
                    Function0<Unit> function03 = function0CurrentBackPressedAction;
                    function17 = function1CurrentActivityErrorHandler;
                    function02 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    isaTransferDetailDuxo3 = isaTransferDetailDuxo2;
                    function02 = function0CurrentBackPressedAction;
                    function16 = function13;
                    function17 = function14;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$29(arg, modifier4, isaTransferDetailDuxo3, function02, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 48;
            modifier2 = modifier;
            if ((i & 384) != 0) {
            }
            if ((i & 3072) != 0) {
            }
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final SnapshotState4<? extends IsaTransferDetailViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(isaTransferDetailDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final Flow eventFlow2 = isaTransferDetailDuxo2.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "IsaTransferDetailComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof IsaTransferDetailEvent) {
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
                    Event<IsaTransferDetailEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof IsaTransferDetailEvent)) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventIsaTransferDetailComposable$lambda$27 = IsaTransferDetailComposable$lambda$27(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventIsaTransferDetailComposable$lambda$27 != null) {
                        eventConsumerInvoke.consume(eventIsaTransferDetailComposable$lambda$27, new Function1() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m15733invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m15733invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function1CurrentActivityErrorHandler.invoke(((IsaTransferDetailEvent.Error) eventIsaTransferDetailComposable$lambda$27.getData()).getT());
                            }
                        });
                    }
                    ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(-2100461564, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2100461564, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:252)");
                            }
                            Function2<Composer, Integer, Unit> lambda$1077094711$feature_isa_transfer_detail_externalDebug = IsaTransferDetailComposable.INSTANCE.getLambda$1077094711$feature_isa_transfer_detail_externalDebug();
                            final Function0<Unit> function032 = function0CurrentBackPressedAction;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1077094711$feature_isa_transfer_detail_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1244605853, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                    invoke(bentoAppBarScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i12) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i12 & 6) == 0) {
                                        i12 |= (i12 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i12 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1244605853, i12, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:255)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function032, composer3, (BentoAppBarScope.$stable << 12) | ((i12 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1506972893, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            if ((i11 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1506972893, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:260)");
                            }
                            final BentoButtons.Type typeDecideContactSupportButtonType = IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4CollectAsStateWithLifecycle3).decideContactSupportButtonType();
                            if (typeDecideContactSupportButtonType != null) {
                                final SnapshotState4<? extends IsaTransferDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                                final Function1<? super String, Unit> function111 = function15;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-82660125, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-82660125, i12, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:262)");
                                        }
                                        LocalShowPlaceholder.Loadable(IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4) instanceof IsaTransferDetailViewState.Loading, null, null, ComposableLambda3.rememberComposableLambda(429762163, true, new C199301(function111, typeDecideContactSupportButtonType), composer3, 54), composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: IsaTransferDetailComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1 */
                                    static final class C199301 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ BentoButtons.Type $buttonType;
                                        final /* synthetic */ Function1<String, Unit> $openDeeplink;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        C199301(Function1<? super String, Unit> function1, BentoButtons.Type type2) {
                                            this.$openDeeplink = function1;
                                            this.$buttonType = type2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR (r3v2 'objRememberedValue' java.lang.Object) = (r2v2 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function1):void (m)] (LINE:267) call: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 20 more
                                            */
                                        public final void invoke(androidx.compose.runtime.Composer r19, int r20) {
                                            /*
                                                r18 = this;
                                                r0 = r18
                                                r14 = r19
                                                r1 = r20
                                                r2 = r1 & 3
                                                r3 = 2
                                                if (r2 != r3) goto L16
                                                boolean r2 = r14.getSkipping()
                                                if (r2 != 0) goto L12
                                                goto L16
                                            L12:
                                                r14.skipToGroupEnd()
                                                return
                                            L16:
                                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r2 == 0) goto L25
                                                r2 = -1
                                                java.lang.String r3 = "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IsaTransferDetailComposable.kt:265)"
                                                r4 = 429762163(0x199da673, float:1.6300648E-23)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                            L25:
                                                r1 = 5004770(0x4c5de2, float:7.013177E-39)
                                                r14.startReplaceGroup(r1)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r0.$openDeeplink
                                                boolean r1 = r14.changed(r1)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r2 = r0.$openDeeplink
                                                java.lang.Object r3 = r14.rememberedValue()
                                                if (r1 != 0) goto L41
                                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r1 = r1.getEmpty()
                                                if (r3 != r1) goto L49
                                            L41:
                                                com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt$IsaTransferDetailComposable$3$1$1$1$$ExternalSyntheticLambda0
                                                r3.<init>(r2)
                                                r14.updateRememberedValue(r3)
                                            L49:
                                                r1 = r3
                                                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                                                r14.endReplaceGroup()
                                                int r2 = com.robinhood.android.common.C11048R.string.general_label_contact_support
                                                r3 = 0
                                                java.lang.String r2 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r2, r14, r3)
                                                androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p011ui.Modifier.INSTANCE
                                                com.robinhood.compose.bento.theme.BentoTheme r4 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                int r5 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                com.robinhood.compose.bento.theme.BentoSpacing r4 = r4.getSpacing(r14, r5)
                                                float r4 = r4.m21590getDefaultD9Ej5fM()
                                                androidx.compose.ui.Modifier r3 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(r3, r4)
                                                com.robinhood.compose.bento.component.BentoButtons$Type r5 = r0.$buttonType
                                                r16 = 0
                                                r17 = 8168(0x1fe8, float:1.1446E-41)
                                                r4 = 0
                                                r6 = 0
                                                r7 = 0
                                                r8 = 0
                                                r9 = 0
                                                r10 = 0
                                                r11 = 0
                                                r12 = 0
                                                r13 = 0
                                                r15 = 0
                                                com.robinhood.compose.bento.component.BentoButtonKt.m20586BentoButtonEikTQX8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto L84
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            L84:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable4.C199301.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
                                            function1.invoke(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, 54), composer2, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(958524825, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposableKt.IsaTransferDetailComposable.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i11) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i11 & 6) == 0) {
                                i11 |= composer2.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i11 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(958524825, i11, -1, "com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable.<anonymous> (IsaTransferDetailComposable.kt:278)");
                            }
                            IsaTransferDetailViewState isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 = IsaTransferDetailComposable3.IsaTransferDetailComposable$lambda$26(snapshotState4CollectAsStateWithLifecycle3);
                            if (isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 instanceof IsaTransferDetailViewState.Loading) {
                                composer2.startReplaceGroup(-1824375478);
                                LoadingScreenComposablesKt.GenericLoadingScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), IsaTransferDetailComposable3.TAG_SHIMMER_LOADER), false, composer2, 0, 2);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26 instanceof IsaTransferDetailViewState.Loaded)) {
                                    composer2.startReplaceGroup(2019356952);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1824100198);
                                IsaTransferDetailViewState.Loaded loaded = (IsaTransferDetailViewState.Loaded) isaTransferDetailViewStateIsaTransferDetailComposable$lambda$26;
                                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                IsaTransferDetailDuxo isaTransferDetailDuxo42 = isaTransferDetailDuxo2;
                                composer2.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer2.changedInstance(isaTransferDetailDuxo42);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new IsaTransferDetailComposable5(isaTransferDetailDuxo42);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                IsaTransferDetailComposable3.ScreenContent(loaded, modifierPadding, (Function0) ((KFunction) objRememberedValue2), composer2, 0, 0);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 504);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    IsaTransferDetailDuxo isaTransferDetailDuxo42 = isaTransferDetailDuxo2;
                    function16 = function15;
                    modifier4 = modifier3;
                    isaTransferDetailDuxo3 = isaTransferDetailDuxo42;
                    Function0<Unit> function032 = function0CurrentBackPressedAction;
                    function17 = function1CurrentActivityErrorHandler;
                    function02 = function032;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
    }
