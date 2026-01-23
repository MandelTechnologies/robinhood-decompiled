package com.robinhood.android.microgramsdui;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader2;
import com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment;
import com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo2;
import com.robinhood.android.microgramsdui.MicrogramBottomSheetDuxo3;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.microgram.sdui.AnyScreen;
import com.robinhood.microgram.sdui.Background;
import com.robinhood.microgram.sdui.BottomSheetMessage2;
import com.robinhood.microgram.sdui.BottomSheetMessage3;
import com.robinhood.microgram.sdui.MicrogramAction;
import com.robinhood.microgram.sdui.StandardScreen5;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.ScreenDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.compose.color.LinearGradientColor;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.inject.MicrogramComponent;
import microgram.android.internal.guest.ResourceLoader;
import microgram.p507ui.p508v1.BottomSheetBackgroundDto;
import microgram.p507ui.p508v1.BottomSheetContentDto;
import microgram.p507ui.p508v1.LinearGradientColorDto;
import microgram.p507ui.p508v1.LoggingContextDto;
import okio.BufferedSource;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: BaseMicrogramBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J5\u0010\r\u001a\u00020\u00042\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0017\u001a\u00020\u00042\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u00109\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00108R\"\u0010<\u001a\n\u0018\u00010:j\u0004\u0018\u0001`;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010A\u001a\u0004\u0018\u00010@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00105R\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006X²\u0006\f\u0010W\u001a\u00020V8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/BaseMicrogramBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "", "logPassiveDismiss", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/BottomSheetPayload;", "Lmicrogram/ui/v1/BottomSheetContentDto;", "Lcom/robinhood/microgram/sdui/AnyBottomSheetPayload;", "payload", "Lkotlin/Function0;", "bottomSheetContent", "StyledContainerOverride", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/microgram/sdui/Theme;", "theme", "content", "BottomSheetTheme", "(Lcom/robinhood/microgram/sdui/Theme;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "screen", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventDescriptor", "Success", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "", "", "metadata", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/microgramsdui/MicrogramBottomSheetDuxo;", "duxo", "", "dismissOnBackPress", "Z", "bottomSheetParentView$delegate", "getBottomSheetParentView", "()Landroid/view/View;", "bottomSheetParentView", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "loggingEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "providedEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "dismissedWithoutCtaButtonInteraction", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "instance", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lcom/robinhood/android/microgramsdui/BottomSheetViewState;", "viewState", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class BaseMicrogramBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {
    public static final int $stable = 8;
    private boolean dismissOnBackPress;
    public EventLogger eventLogger;
    private final Context loggingEventContext;
    private final Screen loggingScreen;
    private final Map<String, String> metadata = MapsKt.emptyMap();

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MicrogramBottomSheetDuxo.class);

    /* renamed from: bottomSheetParentView$delegate, reason: from kotlin metadata */
    private final Lazy bottomSheetParentView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseMicrogramBottomSheetFragment.bottomSheetParentView_delegate$lambda$0(this.f$0);
        }
    });
    private UserInteractionEventDescriptor providedEventDescriptor = new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, 47, null);
    private boolean dismissedWithoutCtaButtonInteraction = true;

    /* compiled from: BaseMicrogramBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StandardScreen5.values().length];
            try {
                iArr[StandardScreen5.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StandardScreen5.ACHROMATIC.ordinal()] = 2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetTheme$lambda$5(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, StandardScreen5 standardScreen5, Function2 function2, int i, Composer composer, int i2) {
        baseMicrogramBottomSheetFragment.BottomSheetTheme(standardScreen5, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyledContainerOverride$lambda$3(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, UiObject uiObject, Function2 function2, int i, Composer composer, int i2) {
        baseMicrogramBottomSheetFragment.StyledContainerOverride(uiObject, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Success$lambda$6(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, UiObject uiObject, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Composer composer, int i2) {
        baseMicrogramBottomSheetFragment.Success(uiObject, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Success$lambda$7(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, UiObject uiObject, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Composer composer, int i2) {
        baseMicrogramBottomSheetFragment.Success(uiObject, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public abstract String getIdentifier();

    public abstract MicrogramManager2 getInstance();

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MicrogramBottomSheetDuxo getDuxo() {
        return (MicrogramBottomSheetDuxo) this.duxo.getValue();
    }

    private final View getBottomSheetParentView() {
        return (View) this.bottomSheetParentView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bottomSheetParentView_delegate$lambda$0(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment) {
        Object parent = baseMicrogramBottomSheetFragment.requireView().getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramBottomSheetDuxo3 ComposeContent$lambda$4(SnapshotState4<? extends MicrogramBottomSheetDuxo3> snapshotState4) {
        return snapshotState4.getValue();
    }

    public Context getLoggingEventContext() {
        return this.loggingEventContext;
    }

    public Screen getLoggingScreen() {
        return this.loggingScreen;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MicrogramManager2 baseMicrogramBottomSheetFragment = getInstance();
        if (baseMicrogramBottomSheetFragment != null) {
            getDuxo().initScreen(getIdentifier(), baseMicrogramBottomSheetFragment);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.dismissedWithoutCtaButtonInteraction) {
            logPassiveDismiss();
        }
    }

    /* compiled from: BaseMicrogramBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$onViewCreated$1", m3645f = "BaseMicrogramBottomSheetFragment.kt", m3646l = {118}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$onViewCreated$1 */
    static final class C218331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C218331(Continuation<? super C218331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseMicrogramBottomSheetFragment.this.new C218331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<MicrogramBottomSheetDuxo2>> eventFlow = BaseMicrogramBottomSheetFragment.this.getDuxo().getEventFlow();
                final BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment = BaseMicrogramBottomSheetFragment.this;
                FlowCollector<? super Event<MicrogramBottomSheetDuxo2>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MicrogramBottomSheetDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MicrogramBottomSheetDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MicrogramBottomSheetDuxo2> eventConsumerInvoke;
                        if (event != null) {
                            final BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment2 = baseMicrogramBottomSheetFragment;
                            if ((event.getData() instanceof MicrogramBottomSheetDuxo2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m16539invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m16539invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (!Intrinsics.areEqual((MicrogramBottomSheetDuxo2) event.getData(), MicrogramBottomSheetDuxo2.Dismiss.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        baseMicrogramBottomSheetFragment2.dismiss();
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C218331(null), 1, null);
    }

    private final void logPassiveDismiss() {
        UserInteractionEventDescriptor userInteractionEventDescriptor = this.providedEventDescriptor;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, userInteractionEventDescriptor.getScreen(), null, null, userInteractionEventDescriptor.getContext(), false, 44, null);
    }

    private final void StyledContainerOverride(final UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Shape shapeM5329RoundedCornerShapea9UjIt4$default;
        Modifier modifierM4871backgroundbw27NRU;
        Composer composerStartRestartGroup = composer.startRestartGroup(-281888384);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiObject) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-281888384, i2, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.StyledContainerOverride (BaseMicrogramBottomSheetFragment.kt:161)");
            }
            UiObject<Background, BottomSheetBackgroundDto> background = BottomSheetMessage2.getBackground(uiObject);
            Integer cornerRadius = BottomSheetMessage2.getCornerRadius(uiObject);
            if (cornerRadius == null) {
                shapeM5329RoundedCornerShapea9UjIt4$default = RectangleShape2.getRectangleShape();
            } else {
                shapeM5329RoundedCornerShapea9UjIt4$default = RoundedCornerShape2.m5329RoundedCornerShapea9UjIt4$default(C2002Dp.m7995constructorimpl(cornerRadius.intValue()), C2002Dp.m7995constructorimpl(cornerRadius.intValue()), 0.0f, 0.0f, 12, null);
            }
            Shape shape = shapeM5329RoundedCornerShapea9UjIt4$default;
            if (cornerRadius != null) {
                getBottomSheetParentView().setBackgroundTintMode(PorterDuff.Mode.CLEAR);
                getBottomSheetParentView().setBackgroundTintList(ColorStateList.valueOf(0));
                getBottomSheetParentView().setBackgroundColor(0);
            }
            if (background instanceof UiObject.Legacy) {
                composerStartRestartGroup.startReplaceGroup(-1074817482);
                Background background2 = (Background) ((UiObject.Legacy) background).getValue();
                if (background2 instanceof Background.Solid) {
                    composerStartRestartGroup.startReplaceGroup(-311763653);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Color composeColor = SduiColors2.toComposeColor(((Background.Solid) background2).getColor(), composerStartRestartGroup, 0);
                    modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(companion, composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue(), shape);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(background2 instanceof Background.Gradient)) {
                        composerStartRestartGroup.startReplaceGroup(-311766196);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-311757003);
                    modifierM4871backgroundbw27NRU = Background3.background$default(Modifier.INSTANCE, LinearGradientColor.getBrush$default(SduiColors2.toLinearGradientColor(((Background.Gradient) background2).getColor(), 0.0f, composerStartRestartGroup, 0, 1), null, 1, null), shape, 0.0f, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (background instanceof UiObject.Idl) {
                composerStartRestartGroup.startReplaceGroup(-1074320924);
                BottomSheetBackgroundDto.ConcreteDto concrete = ((BottomSheetBackgroundDto) ((UiObject.Idl) background).getValue()).getConcrete();
                if (concrete instanceof BottomSheetBackgroundDto.ConcreteDto.Solid) {
                    composerStartRestartGroup.startReplaceGroup(-311746750);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ThemedColorDto color = ((BottomSheetBackgroundDto.ConcreteDto.Solid) concrete).getValue().getColor();
                    composerStartRestartGroup.startReplaceGroup(-311744912);
                    Color composeColor2 = color != null ? SduiColors2.toComposeColor(color, composerStartRestartGroup, 0) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(companion2, composeColor2 == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor2.getValue(), shape);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (concrete instanceof BottomSheetBackgroundDto.ConcreteDto.Gradient) {
                    composerStartRestartGroup.startReplaceGroup(-311738957);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    LinearGradientColorDto color2 = ((BottomSheetBackgroundDto.ConcreteDto.Gradient) concrete).getValue().getColor();
                    if (color2 == null) {
                        color2 = LinearGradientColorDto.INSTANCE.getZeroValue();
                    }
                    modifierM4871backgroundbw27NRU = Background3.background$default(companion3, LinearGradientColor.getBrush$default(Colors4.toLinearGradientColor(color2, 0.0f, composerStartRestartGroup, 0, 1), null, 1, null), shape, 0.0f, 4, null);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (concrete != null) {
                        composerStartRestartGroup.startReplaceGroup(-311750178);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-311730259);
                    modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), shape);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (background != null) {
                    composerStartRestartGroup.startReplaceGroup(-311767049);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-311727379);
                modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), shape);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierClip = Clip.clip(modifierM4871backgroundbw27NRU, shape);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClip);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseMicrogramBottomSheetFragment.StyledContainerOverride$lambda$3(this.f$0, uiObject, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, int i) {
        composer.startReplaceGroup(2026675547);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2026675547, i, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.ComposeContent (BaseMicrogramBottomSheetFragment.kt:219)");
        }
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
        BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(1260428413, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.ComposeContent.1
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
                    ComposerKt.traceEventStart(1260428413, i2, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.ComposeContent.<anonymous> (BaseMicrogramBottomSheetFragment.kt:222)");
                }
                final MicrogramBottomSheetDuxo3 microgramBottomSheetDuxo3ComposeContent$lambda$4 = BaseMicrogramBottomSheetFragment.ComposeContent$lambda$4(snapshotState4CollectAsStateWithLifecycle);
                if (microgramBottomSheetDuxo3ComposeContent$lambda$4 instanceof MicrogramBottomSheetDuxo3.Success) {
                    composer2.startReplaceGroup(90931603);
                    BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment = BaseMicrogramBottomSheetFragment.this;
                    StandardScreen5 theme = AnyScreen.getTheme(((MicrogramBottomSheetDuxo3.Success) microgramBottomSheetDuxo3ComposeContent$lambda$4).getScreen());
                    final BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment2 = BaseMicrogramBottomSheetFragment.this;
                    baseMicrogramBottomSheetFragment.BottomSheetTheme(theme, ComposableLambda3.rememberComposableLambda(1245627938, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            Screen loggingScreen;
                            Context loggingEventContext;
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1245627938, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (BaseMicrogramBottomSheetFragment.kt:224)");
                            }
                            UiObject<BottomSheetMessage3, BottomSheetContentDto> screen = ((MicrogramBottomSheetDuxo3.Success) microgramBottomSheetDuxo3ComposeContent$lambda$4).getScreen();
                            ScreenDto loggingScreen2 = BottomSheetMessage2.getLoggingScreen(screen);
                            if (loggingScreen2 == null || (loggingScreen = loggingScreen2.toProto()) == null) {
                                loggingScreen = baseMicrogramBottomSheetFragment2.getLoggingScreen();
                            }
                            Screen screen2 = loggingScreen;
                            LoggingContextDto loggingEventContext2 = BottomSheetMessage2.getLoggingEventContext(screen);
                            if (loggingEventContext2 != null) {
                                String entry_point_identifier = loggingEventContext2.getEntry_point_identifier();
                                if (entry_point_identifier == null) {
                                    entry_point_identifier = "";
                                }
                                loggingEventContext = new Context(0, 0, 0, null, null, null, null, null, 0, null, entry_point_identifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
                            } else {
                                loggingEventContext = baseMicrogramBottomSheetFragment2.getLoggingEventContext();
                            }
                            Context context = loggingEventContext;
                            Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen2, null, context, new Component(componentType, null, null, 6, null), null, 37, null);
                            composer3.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer3.changedInstance(baseMicrogramBottomSheetFragment2) | composer3.changedInstance(userInteractionEventDescriptor);
                            BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment3 = baseMicrogramBottomSheetFragment2;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BaseMicrogramBottomSheetFragment2(baseMicrogramBottomSheetFragment3, userInteractionEventDescriptor, null);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(userInteractionEventDescriptor, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 0);
                            baseMicrogramBottomSheetFragment2.Success(screen, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, null, new ComponentHierarchy(new Component(componentType, null, null, 6, null), null, null, null, null, 30, null), 31, null), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    composer2.endReplaceGroup();
                } else {
                    if (!(microgramBottomSheetDuxo3ComposeContent$lambda$4 instanceof MicrogramBottomSheetDuxo3.Loading)) {
                        composer2.startReplaceGroup(90929450);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-1474958333);
                    BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(120)), true, null, 2, null), composer2, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BottomSheetTheme(final StandardScreen5 standardScreen5, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-390484149);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(standardScreen5 == null ? -1 : standardScreen5.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-390484149, i2, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme (BaseMicrogramBottomSheetFragment.kt:263)");
            }
            switch (standardScreen5 != null ? WhenMappings.$EnumSwitchMapping$0[standardScreen5.ordinal()] : -1) {
                case -1:
                case 7:
                    composerStartRestartGroup.startReplaceGroup(-1593083212);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 0:
                default:
                    composerStartRestartGroup.startReplaceGroup(-1593107599);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                case 1:
                    composerStartRestartGroup.startReplaceGroup(-1593106977);
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(575815291, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.1
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
                                ComposerKt.traceEventStart(575815291, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:266)");
                            }
                            function2.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(-1593104213);
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1029193911, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.2
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
                                ComposerKt.traceEventStart(1029193911, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:270)");
                            }
                            function2.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(-1593101235);
                    BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1913573181, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.3
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
                                ComposerKt.traceEventStart(-1913573181, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:274)");
                            }
                            function2.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(-1593098226);
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1398400738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.4
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
                                ComposerKt.traceEventStart(1398400738, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:278)");
                            }
                            function2.invoke(composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(-1593094740);
                    BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(415407361, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.5
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
                                ComposerKt.traceEventStart(415407361, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:282)");
                            }
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1913181620, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.5.1
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
                                        ComposerKt.traceEventStart(-1913181620, i4, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous>.<anonymous> (BaseMicrogramBottomSheetFragment.kt:283)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(-1593089363);
                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-567586016, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.6
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
                                ComposerKt.traceEventStart(-567586016, i3, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous> (BaseMicrogramBottomSheetFragment.kt:288)");
                            }
                            final Function2<Composer, Integer, Unit> function22 = function2;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1398792299, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.6.1
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
                                        ComposerKt.traceEventStart(1398792299, i4, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.BottomSheetTheme.<anonymous>.<anonymous> (BaseMicrogramBottomSheetFragment.kt:289)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseMicrogramBottomSheetFragment.BottomSheetTheme$lambda$5(this.f$0, standardScreen5, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Success(final UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject, final UserInteractionEventDescriptor userInteractionEventDescriptor, Composer composer, final int i) {
        int i2;
        MicrogramComponent component;
        ResourceLoader resourceLoader;
        Composer composerStartRestartGroup = composer.startRestartGroup(-14446362);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiObject) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-14446362, i2, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.Success (BaseMicrogramBottomSheetFragment.kt:303)");
            }
            MicrogramManager2 baseMicrogramBottomSheetFragment = getInstance();
            if (baseMicrogramBottomSheetFragment == null || (component = baseMicrogramBottomSheetFragment.getComponent()) == null || (resourceLoader = component.getResourceLoader()) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BaseMicrogramBottomSheetFragment.Success$lambda$6(this.f$0, uiObject, userInteractionEventDescriptor, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            this.dismissOnBackPress = BottomSheetMessage2.getAndroidCanDismissWithBackPress(uiObject);
            setCancelable(BottomSheetMessage2.getCanPassivelyDismiss(uiObject) ? true : BottomSheetMessage2.getAndroidCanDismissWithBackPress(uiObject));
            setDraggable(BottomSheetMessage2.getCanPassivelyDismiss(uiObject));
            StyledContainerOverride(uiObject, ComposableLambda3.rememberComposableLambda(-2100106408, true, new C218321(resourceLoader, userInteractionEventDescriptor, this, uiObject), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 896) | (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseMicrogramBottomSheetFragment.Success$lambda$7(this.f$0, uiObject, userInteractionEventDescriptor, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: BaseMicrogramBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$Success$1 */
    static final class C218321 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ ResourceLoader $resourceLoader;
        final /* synthetic */ UiObject<BottomSheetMessage3, BottomSheetContentDto> $screen;
        final /* synthetic */ BaseMicrogramBottomSheetFragment this$0;

        C218321(ResourceLoader resourceLoader, UserInteractionEventDescriptor userInteractionEventDescriptor, BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
            this.$resourceLoader = resourceLoader;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.this$0 = baseMicrogramBottomSheetFragment;
            this.$screen = uiObject;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final byte[] invoke$lambda$2$lambda$1(ResourceLoader resourceLoader, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            BufferedSource source = resourceLoader.fetch("/" + url).getSource();
            try {
                byte[] byteArray = source.readByteArray();
                Closeable.closeFinally(source, null);
                return byteArray;
            } finally {
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2100106408, i, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.Success.<anonymous> (BaseMicrogramBottomSheetFragment.kt:315)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$resourceLoader);
            final ResourceLoader resourceLoader = this.$resourceLoader;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$Success$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BaseMicrogramBottomSheetFragment.C218321.invoke$lambda$2$lambda$1(resourceLoader, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{MicrogramResourceLoader2.getLocalMicrogramResourceLoader().provides(new BaseMicrogramBottomSheetFragment5((Function1) objRememberedValue)), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(this.$eventDescriptor)}, ComposableLambda3.rememberComposableLambda(-434152, true, new AnonymousClass1(this.this$0, this.$screen), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: BaseMicrogramBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$Success$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ UiObject<BottomSheetMessage3, BottomSheetContentDto> $screen;
            final /* synthetic */ BaseMicrogramBottomSheetFragment this$0;

            AnonymousClass1(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject) {
                this.this$0 = baseMicrogramBottomSheetFragment;
                this.$screen = uiObject;
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
                    ComposerKt.traceEventStart(-434152, i, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.Success.<anonymous>.<anonymous> (BaseMicrogramBottomSheetFragment.kt:322)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment$Success$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BaseMicrogramBottomSheetFragment.C218321.AnonymousClass1.invoke$lambda$1$lambda$0(baseMicrogramBottomSheetFragment, (MicrogramAction) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                final UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject = this.$screen;
                SduiActionHandler7.HandleMicrogramSduiActions((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-755266581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.Success.1.1.2
                    public final void invoke(Composer composer2, int i2) {
                        boolean z;
                        Composer composer3;
                        Composer composer4;
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-755266581, i2, -1, "com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment.Success.<anonymous>.<anonymous>.<anonymous> (BaseMicrogramBottomSheetFragment.kt:327)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(SizeKt.wrapContentSize$default(companion, null, false, 3, null), (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, true, false, false, null, 100, null);
                        UiObject<BottomSheetMessage3, BottomSheetContentDto> uiObject2 = uiObject;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        boolean z2 = uiObject2 instanceof UiObject.Legacy;
                        if (z2) {
                            composer2.startReplaceGroup(-925158272);
                            ImmutableList immutableList = extensions2.toImmutableList(((BottomSheetMessage3) ((UiObject.Legacy) uiObject2).getValue()).getBody());
                            Modifier modifierWeight = column6.weight(companion, 1.0f, false);
                            composer2.startReplaceGroup(767440808);
                            z = z2;
                            SduiColumns.SduiLazyColumn(immutableList, MicrogramAction.class, modifierWeight, LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3), null, null, HorizontalPadding.Default, true, composer2, 12582912, 0);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                            composer3 = composer2;
                        } else {
                            z = z2;
                            if (!(uiObject2 instanceof UiObject.Idl)) {
                                composer2.startReplaceGroup(1355627901);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-924820589);
                            ImmutableList immutableList2 = extensions2.toImmutableList(((BottomSheetContentDto) ((UiObject.Idl) uiObject2).getValue()).getBody());
                            Modifier modifierWeight2 = column6.weight(companion, 1.0f, false);
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = BaseMicrogramBottomSheetFragment3.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1370740990);
                            SduiColumnsIdl.SduiLazyColumn(immutableList2, MicrogramAction.class, (Function1) ((KFunction) objRememberedValue2), modifierWeight2, LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3), null, null, HorizontalPadding.Default, true, composer2, 100663680, 0);
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                            composer3.endReplaceGroup();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM()), composer3, 0);
                        if (z) {
                            composer3.startReplaceGroup(-923939352);
                            ImmutableList immutableList3 = extensions2.toImmutableList(((BottomSheetMessage3) ((UiObject.Legacy) uiObject2).getValue()).getFooter());
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), 7, null);
                            composer3.startReplaceGroup(-1772220517);
                            composer4 = composer2;
                            SduiColumns.SduiColumn(immutableList3, MicrogramAction.class, modifierM5146paddingqDBjuR0$default, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), true, composer4, 100663296, 0);
                            composer4.endReplaceGroup();
                            composer4.endReplaceGroup();
                        } else {
                            if (!(uiObject2 instanceof UiObject.Idl)) {
                                Composer composer5 = composer3;
                                composer5.startReplaceGroup(1355667213);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-923609605);
                            ImmutableList immutableList4 = extensions2.toImmutableList(((BottomSheetContentDto) ((UiObject.Idl) uiObject2).getValue()).getFooter());
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), 7, null);
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = BaseMicrogramBottomSheetFragment4.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(40010095);
                            SduiColumnsIdl.SduiColumnIdl(immutableList4, (Function1) ((KFunction) objRememberedValue3), MicrogramAction.class, modifierM5146paddingqDBjuR0$default2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), true, composer2, 805306416, 0);
                            composer4 = composer2;
                            composer4.endReplaceGroup();
                            composer4.endReplaceGroup();
                        }
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(BaseMicrogramBottomSheetFragment baseMicrogramBottomSheetFragment, MicrogramAction it) {
                Intrinsics.checkNotNullParameter(it, "it");
                baseMicrogramBottomSheetFragment.dismissedWithoutCtaButtonInteraction = false;
                baseMicrogramBottomSheetFragment.getDuxo().action(it);
                return Unit.INSTANCE;
            }
        }
    }
}
