package com.robinhood.microgram.sdui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader2;
import com.robinhood.android.microgramsdui.SduiActionHandler7;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo3;
import com.robinhood.microgram.sdui.MicrogramScreenFragment;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey3;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.AndroidAttributesDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import okio.BufferedSource;

/* compiled from: MicrogramScreenFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012JA\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0018\u0010%\u001a\u00020&*\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010(¨\u0006,²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramScreenFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/microgram/sdui/MicrogramScreenDuxo;", "getDuxo", "()Lcom/robinhood/microgram/sdui/MicrogramScreenDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "SuccessScreen", "state", "Lcom/robinhood/microgram/sdui/ScreenViewState$Success;", "scrollRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "shareScreenshotRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "onScrollRequestComplete", "Lkotlin/Function0;", "invokeJavascriptRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;", "(Lcom/robinhood/microgram/sdui/ScreenViewState$Success;Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Lkotlin/jvm/functions/Function0;Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "isLight", "", "Lcom/robinhood/microgram/sdui/StatusBarStyle;", "(Lcom/robinhood/microgram/sdui/StatusBarStyle;)Z", "Callbacks", "Args", "Companion", "feature-microgram-sdui_externalDebug", "isSystemBarStyleLight"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MicrogramScreenFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MicrogramScreenDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MicrogramScreenFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MicrogramScreenFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Callbacks;", "Lcom/robinhood/microgram/sdui/MicrogramAppUtils;", "Lcom/robinhood/microgram/sdui/ChildFragmentCallbacks;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends MicrogramAppUtils, ChildFragmentCallbacks {
    }

    /* compiled from: MicrogramScreenFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AndroidAttributes3.values().length];
            try {
                iArr[AndroidAttributes3.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AndroidAttributes3.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(MicrogramScreenFragment microgramScreenFragment, int i, Composer composer, int i2) {
        microgramScreenFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessScreen$lambda$16(MicrogramScreenFragment microgramScreenFragment, MicrogramScreenDuxo3.Success success, MicrogramScreenDuxo2.ScrollRequest scrollRequest, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function0 function0, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, int i, Composer composer, int i2) {
        microgramScreenFragment.SuccessScreen(success, scrollRequest, shareScreenshotRequest, function0, invokeJavascript, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramScreenDuxo getDuxo() {
        return (MicrogramScreenDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer eventConsumer;
        Composer composerStartRestartGroup = composer.startRestartGroup(-739603854);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-739603854, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent (MicrogramScreenFragment.kt:50)");
            }
            MicrogramScreenDuxo3 microgramScreenDuxo3 = (MicrogramScreenDuxo3) SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1).getValue();
            final Event event = (Event) SnapshotStateKt.collectAsState(getDuxo().getEventFlow(), null, composerStartRestartGroup, 0, 1).getValue();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null && (event.getData() instanceof MicrogramScreenDuxo2) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                eventConsumer.consume(event, new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m22947invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m22947invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        MicrogramScreenDuxo2 microgramScreenDuxo2 = (MicrogramScreenDuxo2) event.getData();
                        if (!(microgramScreenDuxo2 instanceof MicrogramScreenDuxo2.ScrollRequest)) {
                            if (!(microgramScreenDuxo2 instanceof MicrogramScreenDuxo2.ShareScreenshotRequest)) {
                                if (!(microgramScreenDuxo2 instanceof MicrogramScreenDuxo2.InvokeJavascript)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                snapshotState3.setValue((MicrogramScreenDuxo2.InvokeJavascript) microgramScreenDuxo2);
                                return;
                            }
                            snapshotState2.setValue((MicrogramScreenDuxo2.ShareScreenshotRequest) microgramScreenDuxo2);
                            return;
                        }
                        MicrogramScreenFragment.ComposeContent$lambda$2(snapshotState, (MicrogramScreenDuxo2.ScrollRequest) microgramScreenDuxo2);
                    }
                });
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-180377052, true, new C350382(microgramScreenDuxo3, this, snapshotState, snapshotState2, snapshotState3), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MicrogramScreenFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MicrogramScreenFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2 */
    static final class C350382 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> $invokeJavascriptRequest$delegate;
        final /* synthetic */ SnapshotState<MicrogramScreenDuxo2.ScrollRequest> $scrollRequest$delegate;
        final /* synthetic */ SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> $shareScreenshotRequest$delegate;
        final /* synthetic */ MicrogramScreenDuxo3 $state;
        final /* synthetic */ MicrogramScreenFragment this$0;

        /* compiled from: MicrogramScreenFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StandardScreen5.values().length];
                try {
                    iArr[StandardScreen5.ACHROMATIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StandardScreen5.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StandardScreen5.LIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StandardScreen5.DARK.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StandardScreen5.LIGHT_ACHROMATIC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StandardScreen5.DARK_ACHROMATIC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StandardScreen5.DEFAULT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C350382(MicrogramScreenDuxo3 microgramScreenDuxo3, MicrogramScreenFragment microgramScreenFragment, SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState, SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState2, SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState3) {
            this.$state = microgramScreenDuxo3;
            this.this$0 = microgramScreenFragment;
            this.$scrollRequest$delegate = snapshotState;
            this.$shareScreenshotRequest$delegate = snapshotState2;
            this.$invokeJavascriptRequest$delegate = snapshotState3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
            MicrogramScreenFragment.ComposeContent$lambda$2(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, Boolean bool) {
            snapshotState.setValue(bool);
        }

        public final void invoke(Composer composer, int i) {
            SnapshotState snapshotState;
            Continuation continuation;
            Composer composer2;
            Composer composer3;
            SnapshotState snapshotState2;
            final SnapshotState snapshotState3;
            Composer composer4;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-180377052, i, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous> (MicrogramScreenFragment.kt:65)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            MicrogramScreenDuxo3 microgramScreenDuxo3 = this.$state;
            if (microgramScreenDuxo3 instanceof MicrogramScreenDuxo3.Success) {
                composer.startReplaceGroup(-608384812);
                UiObject<AndroidAttributes, AndroidAttributesDto> androidAttributes = AnyScreen.getAndroidAttributes(((MicrogramScreenDuxo3.Success) this.$state).getScreen());
                final AndroidAttributes3 statusBarStyle = androidAttributes != null ? AndroidAttributes2.getStatusBarStyle(androidAttributes) : null;
                composer.startReplaceGroup(5004770);
                final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState5 = this.$scrollRequest$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MicrogramScreenFragment.C350382.invoke$lambda$4$lambda$3(snapshotState5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                final Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                StandardScreen5 theme = AnyScreen.getTheme(((MicrogramScreenDuxo3.Success) this.$state).getScreen());
                if (theme == null) {
                    theme = ((Args) MicrogramScreenFragment.INSTANCE.getArgs((Fragment) this.this$0)).getParentTheme();
                }
                switch (WhenMappings.$EnumSwitchMapping$0[theme.ordinal()]) {
                    case 1:
                        composer3 = composer;
                        composer3.startReplaceGroup(-1543636591);
                        final MicrogramScreenFragment microgramScreenFragment = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo32 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState6 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState7 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState8 = this.$invokeJavascriptRequest$delegate;
                        snapshotState2 = snapshotState4;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2081500290, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2081500290, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:79)");
                                }
                                SnapshotState<Boolean> snapshotState9 = snapshotState4;
                                AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                C350382.invoke$lambda$2(snapshotState9, Boolean.valueOf(androidAttributes3 != null ? microgramScreenFragment.isLight(androidAttributes3) : DayNightChanges.isDay(microgramScreenFragment.getScarletManager())));
                                microgramScreenFragment.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo32, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState6), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState7), function0, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState8), composer5, 3072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 6);
                        composer3.endReplaceGroup();
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 2:
                        snapshotState3 = snapshotState4;
                        composer.startReplaceGroup(-1543614598);
                        final MicrogramScreenFragment microgramScreenFragment2 = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo33 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState9 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState10 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState11 = this.$invokeJavascriptRequest$delegate;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-119980968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-119980968, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:90)");
                                }
                                SnapshotState<Boolean> snapshotState12 = snapshotState3;
                                AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                C350382.invoke$lambda$2(snapshotState12, Boolean.valueOf(androidAttributes3 != null ? microgramScreenFragment2.isLight(androidAttributes3) : DayNightChanges.isDay(microgramScreenFragment2.getScarletManager())));
                                microgramScreenFragment2.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo33, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState9), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState10), function0, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState11), composer5, 3072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663296, 255);
                        composer3 = composer;
                        composer3.endReplaceGroup();
                        snapshotState2 = snapshotState3;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 3:
                        snapshotState3 = snapshotState4;
                        composer.startReplaceGroup(-1543596330);
                        Boolean bool = Boolean.TRUE;
                        final MicrogramScreenFragment microgramScreenFragment3 = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo34 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState12 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState13 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState14 = this.$invokeJavascriptRequest$delegate;
                        BentoTheme2.BentoTheme(bool, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(116188855, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(116188855, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:101)");
                                }
                                SnapshotState<Boolean> snapshotState15 = snapshotState3;
                                AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                C350382.invoke$lambda$2(snapshotState15, androidAttributes3 != null ? Boolean.valueOf(microgramScreenFragment3.isLight(androidAttributes3)) : Boolean.TRUE);
                                microgramScreenFragment3.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo34, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState12), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState13), function0, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState14), composer5, 3072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer4 = composer;
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                        snapshotState2 = snapshotState3;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 4:
                        snapshotState3 = snapshotState4;
                        composer.startReplaceGroup(-1543578216);
                        Boolean bool2 = Boolean.FALSE;
                        final MicrogramScreenFragment microgramScreenFragment4 = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo35 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState15 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState16 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState17 = this.$invokeJavascriptRequest$delegate;
                        BentoTheme2.BentoTheme(bool2, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(352358678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(352358678, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:112)");
                                }
                                SnapshotState<Boolean> snapshotState18 = snapshotState3;
                                AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                C350382.invoke$lambda$2(snapshotState18, androidAttributes3 != null ? Boolean.valueOf(microgramScreenFragment4.isLight(androidAttributes3)) : Boolean.FALSE);
                                microgramScreenFragment4.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo35, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState15), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState16), function0, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState17), composer5, 3072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer4 = composer;
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                        snapshotState2 = snapshotState3;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 5:
                        snapshotState3 = snapshotState4;
                        composer.startReplaceGroup(-1543559551);
                        Boolean bool3 = Boolean.TRUE;
                        final MicrogramScreenFragment microgramScreenFragment5 = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo36 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState18 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState19 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState20 = this.$invokeJavascriptRequest$delegate;
                        BentoTheme2.BentoTheme(bool3, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(588528501, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(588528501, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:123)");
                                }
                                final AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                final MicrogramScreenFragment microgramScreenFragment6 = microgramScreenFragment5;
                                final MicrogramScreenDuxo3 microgramScreenDuxo37 = microgramScreenDuxo36;
                                final Function0<Unit> function02 = function0;
                                final SnapshotState<Boolean> snapshotState21 = snapshotState3;
                                final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState22 = snapshotState18;
                                final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState23 = snapshotState19;
                                final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState24 = snapshotState20;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(492478976, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.5.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i3) {
                                        if ((i3 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(492478976, i3, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:124)");
                                        }
                                        SnapshotState<Boolean> snapshotState25 = snapshotState21;
                                        AndroidAttributes3 androidAttributes32 = androidAttributes3;
                                        C350382.invoke$lambda$2(snapshotState25, androidAttributes32 != null ? Boolean.valueOf(microgramScreenFragment6.isLight(androidAttributes32)) : Boolean.TRUE);
                                        microgramScreenFragment6.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo37, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState22), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState23), function02, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState24), composer6, 3072);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer4 = composer;
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                        snapshotState2 = snapshotState3;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 6:
                        composer.startReplaceGroup(-1543537661);
                        Boolean bool4 = Boolean.FALSE;
                        final MicrogramScreenFragment microgramScreenFragment6 = this.this$0;
                        final MicrogramScreenDuxo3 microgramScreenDuxo37 = this.$state;
                        final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState21 = this.$scrollRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState22 = this.$shareScreenshotRequest$delegate;
                        final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState23 = this.$invokeJavascriptRequest$delegate;
                        snapshotState3 = snapshotState4;
                        BentoTheme2.BentoTheme(bool4, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(824698324, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i2) {
                                if ((i2 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(824698324, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:136)");
                                }
                                final AndroidAttributes3 androidAttributes3 = statusBarStyle;
                                final MicrogramScreenFragment microgramScreenFragment7 = microgramScreenFragment6;
                                final MicrogramScreenDuxo3 microgramScreenDuxo38 = microgramScreenDuxo37;
                                final Function0<Unit> function02 = function0;
                                final SnapshotState<Boolean> snapshotState24 = snapshotState4;
                                final SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState25 = snapshotState21;
                                final SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState26 = snapshotState22;
                                final SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState27 = snapshotState23;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(728648799, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.6.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i3) {
                                        if ((i3 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(728648799, i3, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:137)");
                                        }
                                        SnapshotState<Boolean> snapshotState28 = snapshotState24;
                                        AndroidAttributes3 androidAttributes32 = androidAttributes3;
                                        C350382.invoke$lambda$2(snapshotState28, androidAttributes32 != null ? Boolean.valueOf(microgramScreenFragment7.isLight(androidAttributes32)) : Boolean.FALSE);
                                        microgramScreenFragment7.SuccessScreen((MicrogramScreenDuxo3.Success) microgramScreenDuxo38, MicrogramScreenFragment.ComposeContent$lambda$1(snapshotState25), MicrogramScreenFragment.ComposeContent$lambda$4(snapshotState26), function02, MicrogramScreenFragment.ComposeContent$lambda$7(snapshotState27), composer6, 3072);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer4 = composer;
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                        snapshotState2 = snapshotState3;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    case 7:
                        composer.startReplaceGroup(-604358253);
                        MicrogramScreenFragment microgramScreenFragment7 = this.this$0;
                        snapshotState4.setValue(Boolean.valueOf(statusBarStyle != null ? microgramScreenFragment7.isLight(statusBarStyle) : DayNightChanges.isDay(microgramScreenFragment7.getScarletManager())));
                        this.this$0.SuccessScreen((MicrogramScreenDuxo3.Success) this.$state, MicrogramScreenFragment.ComposeContent$lambda$1(this.$scrollRequest$delegate), MicrogramScreenFragment.ComposeContent$lambda$4(this.$shareScreenshotRequest$delegate), function0, MicrogramScreenFragment.ComposeContent$lambda$7(this.$invokeJavascriptRequest$delegate), composer, 3072);
                        composer.endReplaceGroup();
                        composer3 = composer;
                        snapshotState2 = snapshotState4;
                        composer3.endReplaceGroup();
                        snapshotState = snapshotState2;
                        continuation = null;
                        composer2 = composer3;
                        break;
                    default:
                        composer.startReplaceGroup(-1543635661);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                }
            } else if (microgramScreenDuxo3 instanceof MicrogramScreenDuxo3.Loading) {
                composer.startReplaceGroup(-603710074);
                snapshotState4.setValue(Boolean.valueOf(DayNightChanges.isDay(this.this$0.getScarletManager())));
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                final Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null));
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                final MicrogramScreenFragment microgramScreenFragment8 = this.this$0;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1405631084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i3) {
                        if ((i3 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1405631084, i3, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:168)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(MicrogramScreenFragment2.INSTANCE.m22938getLambda$175551207$feature_microgram_sdui_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1809895277, true, new AnonymousClass1(microgramScreenFragment8), composer5, 54), null, null, false, false, null, null, 0L, null, composer5, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: MicrogramScreenFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$7$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ MicrogramScreenFragment this$0;

                        /* compiled from: MicrogramScreenFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$7$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[MicrogramRouterFragmentKey3.values().length];
                                try {
                                    iArr[MicrogramRouterFragmentKey3.BACK.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[MicrogramRouterFragmentKey3.CLOSE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass1(MicrogramScreenFragment microgramScreenFragment) {
                            this.this$0 = microgramScreenFragment;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1809895277, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:171)");
                            }
                            int i3 = WhenMappings.$EnumSwitchMapping$0[((Args) MicrogramScreenFragment.INSTANCE.getArgs((Fragment) this.this$0)).getNavButtonType().ordinal()];
                            if (i3 == 1) {
                                composer.startReplaceGroup(-152389448);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final MicrogramScreenFragment microgramScreenFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$7$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MicrogramScreenFragment.C350382.AnonymousClass7.AnonymousClass1.invoke$lambda$1$lambda$0(microgramScreenFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                composer.endReplaceGroup();
                            } else {
                                if (i3 != 2) {
                                    composer.startReplaceGroup(-152392056);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(-152381798);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                final MicrogramScreenFragment microgramScreenFragment2 = this.this$0;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$7$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return MicrogramScreenFragment.C350382.AnonymousClass7.AnonymousClass1.invoke$lambda$3$lambda$2(microgramScreenFragment2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue2, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MicrogramScreenFragment microgramScreenFragment) {
                            microgramScreenFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(MicrogramScreenFragment microgramScreenFragment) {
                            microgramScreenFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            return Unit.INSTANCE;
                        }
                    }
                }, composer, 54);
                final MicrogramScreenFragment microgramScreenFragment9 = this.this$0;
                continuation = null;
                snapshotState = snapshotState4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(198897143, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.2.8

                    /* compiled from: MicrogramScreenFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$ComposeContent$2$8$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[MicrogramRouterFragmentKey2.values().length];
                            try {
                                iArr[MicrogramRouterFragmentKey2.LIST.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[MicrogramRouterFragmentKey2.GENERIC.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[MicrogramRouterFragmentKey2.BOXES.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[MicrogramRouterFragmentKey2.HERO.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[MicrogramRouterFragmentKey2.EMPTY.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                        invoke(paddingValues, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer5, int i3) {
                        int i4;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i3 & 6) == 0) {
                            i4 = (composer5.changed(paddingValues) ? 4 : 2) | i3;
                        } else {
                            i4 = i3;
                        }
                        if ((i4 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(198897143, i4, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.ComposeContent.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:184)");
                        }
                        int i5 = WhenMappings.$EnumSwitchMapping$0[((Args) MicrogramScreenFragment.INSTANCE.getArgs((Fragment) microgramScreenFragment9)).getLoadingContent().ordinal()];
                        if (i5 == 1) {
                            composer5.startReplaceGroup(-2133369773);
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(modifierStatusBarsPadding, paddingValues), true, false, 0, composer5, 48, 12);
                            composer5.endReplaceGroup();
                        } else if (i5 == 2) {
                            composer5.startReplaceGroup(-2133362016);
                            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(modifierStatusBarsPadding, paddingValues), false, composer5, 0, 2);
                            composer5.endReplaceGroup();
                        } else if (i5 == 3) {
                            composer5.startReplaceGroup(-2133355899);
                            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(PaddingKt.padding(modifierStatusBarsPadding, paddingValues), composer5, 0, 0);
                            composer5.endReplaceGroup();
                        } else if (i5 == 4) {
                            composer5.startReplaceGroup(-2133349608);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(modifierStatusBarsPadding, paddingValues), null, true, false, composer5, 384, 10);
                            composer5.endReplaceGroup();
                        } else {
                            if (i5 != 5) {
                                composer5.startReplaceGroup(-2133371534);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer5.startReplaceGroup(-2133341893);
                            composer5.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                composer2 = composer;
                composer2.endReplaceGroup();
            } else {
                snapshotState = snapshotState4;
                continuation = null;
                composer2 = composer;
                composer2.startReplaceGroup(-601534370);
                composer2.endReplaceGroup();
            }
            EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composer2.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            Boolean boolInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            composer2.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer2.changedInstance(edgeToEdgeHost);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new MicrogramScreenFragment4(snapshotState, edgeToEdgeHost, continuation);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolInvoke$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramScreenDuxo2.ScrollRequest ComposeContent$lambda$1(SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramScreenDuxo2.ShareScreenshotRequest ComposeContent$lambda$4(SnapshotState<MicrogramScreenDuxo2.ShareScreenshotRequest> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramScreenDuxo2.InvokeJavascript ComposeContent$lambda$7(SnapshotState<MicrogramScreenDuxo2.InvokeJavascript> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$2(SnapshotState<MicrogramScreenDuxo2.ScrollRequest> snapshotState, MicrogramScreenDuxo2.ScrollRequest scrollRequest) {
        snapshotState.setValue(scrollRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SuccessScreen(final MicrogramScreenDuxo3.Success success, final MicrogramScreenDuxo2.ScrollRequest scrollRequest, final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, final Function0<Unit> function0, final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, Composer composer, final int i) {
        int i2;
        Function0<Unit> function02;
        final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-376547776);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(scrollRequest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(shareScreenshotRequest) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            invokeJavascript2 = invokeJavascript;
            i2 |= composerStartRestartGroup.changedInstance(invokeJavascript2) ? 16384 : 8192;
        } else {
            invokeJavascript2 = invokeJavascript;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-376547776, i2, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen (MicrogramScreenFragment.kt:225)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MicrogramScreenFragment.SuccessScreen$lambda$13$lambda$12(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MicrogramScreenFragment.SuccessScreen$lambda$15$lambda$14(this.f$0, (MicrogramAction) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Function0<Unit> function03 = function02;
            SduiActionHandler7.HandleMicrogramSduiActions((Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1931853907, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1931853907, i3, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen.<anonymous> (MicrogramScreenFragment.kt:230)");
                    }
                    ProvidedValue<MicrogramResourceLoader> providedValueProvides = MicrogramResourceLoader2.getLocalMicrogramResourceLoader().provides(new MicrogramScreenFragment7(function1));
                    final MicrogramScreenDuxo3.Success success2 = success;
                    final MicrogramScreenFragment microgramScreenFragment = this;
                    final Function0<Unit> function04 = function03;
                    final MicrogramScreenDuxo2.ScrollRequest scrollRequest2 = scrollRequest;
                    final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest2 = shareScreenshotRequest;
                    final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript3 = invokeJavascript2;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1548399891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen.2.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1548399891, i4, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:231)");
                            }
                            com.robinhood.rosetta.eventlogging.Screen rosettaScreen = LoggingUtils9.toRosettaScreen(success2.getScreen());
                            UiObject<LoggingContext, LoggingContextDto> loggingContext = AnyScreen.getLoggingContext(success2.getScreen());
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, rosettaScreen, null, loggingContext != null ? LoggingUtils9.toEventContext(loggingContext) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(664955902, true, new C506611(success2, microgramScreenFragment, function04, scrollRequest2, shareScreenshotRequest2, invokeJavascript3), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MicrogramScreenFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C506611 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ MicrogramScreenDuxo2.InvokeJavascript $invokeJavascriptRequest;
                            final /* synthetic */ Function0<Unit> $onScrollRequestComplete;
                            final /* synthetic */ MicrogramScreenDuxo2.ScrollRequest $scrollRequest;
                            final /* synthetic */ MicrogramScreenDuxo2.ShareScreenshotRequest $shareScreenshotRequest;
                            final /* synthetic */ MicrogramScreenDuxo3.Success $state;
                            final /* synthetic */ MicrogramScreenFragment this$0;

                            /* compiled from: MicrogramScreenFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[RouterMessage5.values().length];
                                    try {
                                        iArr[RouterMessage5.CENTERED_CONTENT.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[RouterMessage5.LIST.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[RouterMessage5.HTML_CANVAS_CONTENT.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            C506611(MicrogramScreenDuxo3.Success success, MicrogramScreenFragment microgramScreenFragment, Function0<Unit> function0, MicrogramScreenDuxo2.ScrollRequest scrollRequest, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript) {
                                this.$state = success;
                                this.this$0 = microgramScreenFragment;
                                this.$onScrollRequestComplete = function0;
                                this.$scrollRequest = scrollRequest;
                                this.$shareScreenshotRequest = shareScreenshotRequest;
                                this.$invokeJavascriptRequest = invokeJavascript;
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
                                    ComposerKt.traceEventStart(664955902, i, -1, "com.robinhood.microgram.sdui.MicrogramScreenFragment.SuccessScreen.<anonymous>.<anonymous>.<anonymous> (MicrogramScreenFragment.kt:237)");
                                }
                                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$state.getScreenType().ordinal()];
                                if (i2 == 1 || i2 == 2) {
                                    composer.startReplaceGroup(1312384379);
                                    UiObject<?, ?> screen = this.$state.getScreen();
                                    Intrinsics.checkNotNull(screen, "null cannot be cast to non-null type com.robinhood.android.shared.serverui.utils.UiObject<com.robinhood.microgram.sdui.StandardScreen, microgram.ui.v1.StandardScreenContentDto>");
                                    RouterMessage5 screenType = this.$state.getScreenType();
                                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                    Callbacks callbacks = this.this$0.getCallbacks();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(callbacks);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new MicrogramScreenFragment5(callbacks);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                                    Function0<Unit> function02 = this.$onScrollRequestComplete;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                    final MicrogramScreenFragment microgramScreenFragment = this.this$0;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MicrogramScreenFragment.C350392.AnonymousClass1.C506611.invoke$lambda$2$lambda$1(microgramScreenFragment);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function0 function03 = (Function0) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    MicrogramScreenDuxo2.ScrollRequest scrollRequest = this.$scrollRequest;
                                    MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest = this.$shareScreenshotRequest;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                                    final MicrogramScreenFragment microgramScreenFragment2 = this.this$0;
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MicrogramScreenFragment.C350392.AnonymousClass1.C506611.invoke$lambda$4$lambda$3(microgramScreenFragment2, (Map) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    ListScreen.ListScreen(screen, screenType, function0, function02, function03, modifierLogScreenTransitions$default, scrollRequest, shareScreenshotRequest, (Function1) objRememberedValue3, composer, 0, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    if (i2 != 3) {
                                        composer.startReplaceGroup(-927502743);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(1313234771);
                                    UiObject<?, ?> screen2 = this.$state.getScreen();
                                    Intrinsics.checkNotNull(screen2, "null cannot be cast to non-null type com.robinhood.android.shared.serverui.utils.UiObject<com.robinhood.microgram.sdui.HtmlCanvasScreen, microgram.ui.v1.HtmlCanvasScreenContentDto>");
                                    Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                    Callbacks callbacks2 = this.this$0.getCallbacks();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer.changedInstance(callbacks2);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new MicrogramScreenFragment6(callbacks2);
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer.endReplaceGroup();
                                    Function0 function04 = (Function0) ((KFunction) objRememberedValue4);
                                    MicrogramScreenDuxo2.InvokeJavascript invokeJavascript = this.$invokeJavascriptRequest;
                                    MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest2 = this.$shareScreenshotRequest;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                                    final MicrogramScreenFragment microgramScreenFragment3 = this.this$0;
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MicrogramScreenFragment.C350392.AnonymousClass1.C506611.invoke$lambda$7$lambda$6(microgramScreenFragment3, (String) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue5;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance6 = composer.changedInstance(this.this$0);
                                    final MicrogramScreenFragment microgramScreenFragment4 = this.this$0;
                                    Object objRememberedValue6 = composer.rememberedValue();
                                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MicrogramScreenFragment.C350392.AnonymousClass1.C506611.invoke$lambda$9$lambda$8(microgramScreenFragment4, (HtmlCanvasAvailableAreaMessageDto) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue6);
                                    }
                                    Function1 function12 = (Function1) objRememberedValue6;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance7 = composer.changedInstance(this.this$0);
                                    final MicrogramScreenFragment microgramScreenFragment5 = this.this$0;
                                    Object objRememberedValue7 = composer.rememberedValue();
                                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new Function1() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$SuccessScreen$2$1$1$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return MicrogramScreenFragment.C350392.AnonymousClass1.C506611.invoke$lambda$11$lambda$10(microgramScreenFragment5, (Map) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue7);
                                    }
                                    composer.endReplaceGroup();
                                    CanvasScreen.CanvasScreen(screen2, function04, modifierLogScreenTransitions$default2, invokeJavascript, shareScreenshotRequest2, function1, function12, (Function1) objRememberedValue7, composer, 0, 0);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(MicrogramScreenFragment microgramScreenFragment) {
                                microgramScreenFragment.getDuxo().onScrollReachedEnd();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3(MicrogramScreenFragment microgramScreenFragment, Map it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                microgramScreenFragment.getDuxo().updateStates(it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6(MicrogramScreenFragment microgramScreenFragment, String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                microgramScreenFragment.getDuxo().onHtmlCanvasCustomMessage(it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$9$lambda$8(MicrogramScreenFragment microgramScreenFragment, HtmlCanvasAvailableAreaMessageDto it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                microgramScreenFragment.getDuxo().onHtmlCanvasAvailableAreaMessage(it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$11$lambda$10(MicrogramScreenFragment microgramScreenFragment, Map it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                microgramScreenFragment.getDuxo().updateStates(it);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.MicrogramScreenFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MicrogramScreenFragment.SuccessScreen$lambda$16(this.f$0, success, scrollRequest, shareScreenshotRequest, function0, invokeJavascript, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] SuccessScreen$lambda$13$lambda$12(MicrogramScreenFragment microgramScreenFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        BufferedSource source = microgramScreenFragment.getCallbacks().getInstance().getComponent().getResourceLoader().fetch("/" + url).getSource();
        try {
            byte[] byteArray = source.readByteArray();
            Closeable.closeFinally(source, null);
            return byteArray;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessScreen$lambda$15$lambda$14(MicrogramScreenFragment microgramScreenFragment, MicrogramAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        microgramScreenFragment.getDuxo().action(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MicrogramScreenDuxo duxo = getDuxo();
        Companion companion = INSTANCE;
        duxo.initScreen(((Args) companion.getArgs((Fragment) this)).getIdentifier(), ((Args) companion.getArgs((Fragment) this)).getEncodedInitialContent(), ((Args) companion.getArgs((Fragment) this)).getScreenType(), getCallbacks().getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLight(AndroidAttributes3 androidAttributes3) {
        int i = WhenMappings.$EnumSwitchMapping$0[androidAttributes3.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: MicrogramScreenFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Args;", "Landroid/os/Parcelable;", "identifier", "", "encodedInitialContent", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "parentTheme", "Lcom/robinhood/microgram/sdui/Theme;", "loadingContent", "Lcom/robinhood/shared/common/contracts/LoadingContent;", "navButtonType", "Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/microgram/sdui/ScreenType;Lcom/robinhood/microgram/sdui/Theme;Lcom/robinhood/shared/common/contracts/LoadingContent;Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;)V", "getIdentifier", "()Ljava/lang/String;", "getEncodedInitialContent", "getScreenType", "()Lcom/robinhood/microgram/sdui/ScreenType;", "getParentTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "getLoadingContent", "()Lcom/robinhood/shared/common/contracts/LoadingContent;", "getNavButtonType", "()Lcom/robinhood/shared/common/contracts/LoadingNavButtonType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String encodedInitialContent;
        private final String identifier;
        private final MicrogramRouterFragmentKey2 loadingContent;
        private final MicrogramRouterFragmentKey3 navButtonType;
        private final StandardScreen5 parentTheme;
        private final RouterMessage5 screenType;

        /* compiled from: MicrogramScreenFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), RouterMessage5.valueOf(parcel.readString()), StandardScreen5.valueOf(parcel.readString()), MicrogramRouterFragmentKey2.valueOf(parcel.readString()), MicrogramRouterFragmentKey3.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, RouterMessage5 routerMessage5, StandardScreen5 standardScreen5, MicrogramRouterFragmentKey2 microgramRouterFragmentKey2, MicrogramRouterFragmentKey3 microgramRouterFragmentKey3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.identifier;
            }
            if ((i & 2) != 0) {
                str2 = args.encodedInitialContent;
            }
            if ((i & 4) != 0) {
                routerMessage5 = args.screenType;
            }
            if ((i & 8) != 0) {
                standardScreen5 = args.parentTheme;
            }
            if ((i & 16) != 0) {
                microgramRouterFragmentKey2 = args.loadingContent;
            }
            if ((i & 32) != 0) {
                microgramRouterFragmentKey3 = args.navButtonType;
            }
            MicrogramRouterFragmentKey2 microgramRouterFragmentKey22 = microgramRouterFragmentKey2;
            MicrogramRouterFragmentKey3 microgramRouterFragmentKey32 = microgramRouterFragmentKey3;
            return args.copy(str, str2, routerMessage5, standardScreen5, microgramRouterFragmentKey22, microgramRouterFragmentKey32);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        /* renamed from: component3, reason: from getter */
        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        /* renamed from: component4, reason: from getter */
        public final StandardScreen5 getParentTheme() {
            return this.parentTheme;
        }

        /* renamed from: component5, reason: from getter */
        public final MicrogramRouterFragmentKey2 getLoadingContent() {
            return this.loadingContent;
        }

        /* renamed from: component6, reason: from getter */
        public final MicrogramRouterFragmentKey3 getNavButtonType() {
            return this.navButtonType;
        }

        public final Args copy(String identifier, String encodedInitialContent, RouterMessage5 screenType, StandardScreen5 parentTheme, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(parentTheme, "parentTheme");
            Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            return new Args(identifier, encodedInitialContent, screenType, parentTheme, loadingContent, navButtonType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.identifier, args.identifier) && Intrinsics.areEqual(this.encodedInitialContent, args.encodedInitialContent) && this.screenType == args.screenType && this.parentTheme == args.parentTheme && this.loadingContent == args.loadingContent && this.navButtonType == args.navButtonType;
        }

        public int hashCode() {
            return (((((((((this.identifier.hashCode() * 31) + this.encodedInitialContent.hashCode()) * 31) + this.screenType.hashCode()) * 31) + this.parentTheme.hashCode()) * 31) + this.loadingContent.hashCode()) * 31) + this.navButtonType.hashCode();
        }

        public String toString() {
            return "Args(identifier=" + this.identifier + ", encodedInitialContent=" + this.encodedInitialContent + ", screenType=" + this.screenType + ", parentTheme=" + this.parentTheme + ", loadingContent=" + this.loadingContent + ", navButtonType=" + this.navButtonType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
            dest.writeString(this.encodedInitialContent);
            dest.writeString(this.screenType.name());
            dest.writeString(this.parentTheme.name());
            dest.writeString(this.loadingContent.name());
            dest.writeString(this.navButtonType.name());
        }

        public Args(String identifier, String encodedInitialContent, RouterMessage5 screenType, StandardScreen5 parentTheme, MicrogramRouterFragmentKey2 loadingContent, MicrogramRouterFragmentKey3 navButtonType) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(encodedInitialContent, "encodedInitialContent");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(parentTheme, "parentTheme");
            Intrinsics.checkNotNullParameter(loadingContent, "loadingContent");
            Intrinsics.checkNotNullParameter(navButtonType, "navButtonType");
            this.identifier = identifier;
            this.encodedInitialContent = encodedInitialContent;
            this.screenType = screenType;
            this.parentTheme = parentTheme;
            this.loadingContent = loadingContent;
            this.navButtonType = navButtonType;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getEncodedInitialContent() {
            return this.encodedInitialContent;
        }

        public final RouterMessage5 getScreenType() {
            return this.screenType;
        }

        public final StandardScreen5 getParentTheme() {
            return this.parentTheme;
        }

        public final MicrogramRouterFragmentKey2 getLoadingContent() {
            return this.loadingContent;
        }

        public final MicrogramRouterFragmentKey3 getNavButtonType() {
            return this.navButtonType;
        }
    }

    /* compiled from: MicrogramScreenFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/MicrogramScreenFragment;", "Lcom/robinhood/microgram/sdui/MicrogramScreenFragment$Args;", "<init>", "()V", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MicrogramScreenFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MicrogramScreenFragment microgramScreenFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, microgramScreenFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramScreenFragment newInstance(Args args) {
            return (MicrogramScreenFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramScreenFragment microgramScreenFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, microgramScreenFragment, args);
        }
    }
}
