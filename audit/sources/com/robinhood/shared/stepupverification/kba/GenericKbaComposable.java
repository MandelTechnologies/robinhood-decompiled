package com.robinhood.shared.stepupverification.kba;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.DateOfBirthVisualTransformation;
import com.robinhood.compose.common.SsnVisualTransformation;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.models.workflow.p358ui.screens.GenericKbaScreen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.kba.GenericKbaComposable;
import com.robinhood.shared.stepupverification.kba.GenericKbaEvent;
import com.robinhood.shared.stepupverification.support.PhoneNumberVisualTransformation;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: GenericKbaComposable.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a]\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u001b\u001a\u00020\u001c*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\u0014\u0010\u001f\u001a\u00020 *\u00020\u00162\u0006\u0010!\u001a\u00020\u001eH\u0002\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00052\u0006\u0010#\u001a\u00020\u0016H\u0002\u001a\f\u0010$\u001a\u00020\u001e*\u00020\u0005H\u0002\u001a\f\u0010%\u001a\u00020\u001e*\u00020\u0005H\u0002\u001a\f\u0010&\u001a\u00020\u001e*\u00020\u0005H\u0002\"\u0018\u0010\u0015\u001a\u00020\u0013*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00020\u0013*\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\"\u0016\u0010'\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b(\u0010)¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\u0012\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.X\u008a\u0084\u0002"}, m3636d2 = {"GenericKbaComposable", "", "duxo", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaDuxo;", "heading", "", "subheading", "fields", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/workflow/ui/screens/GenericKbaScreen$Field;", "primaryCtaText", "secondaryCtaText", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/stepupverification/kba/GenericKbaDuxo;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainContent", "inputTexts", "onValueChange", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "maxLength", "Lcom/robinhood/models/workflow/ui/screens/GenericKbaScreen$Field$Type;", "getMaxLength", "(Lcom/robinhood/models/workflow/ui/screens/GenericKbaScreen$Field$Type;)I", "error", "getError", "getKeyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "isLastField", "", "getVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "focused", "isValid", "type", "isValidDate", "isValidPhoneNumber", "isValidSsn", GenericKbaComposable.GenericKbaSplashTestTag, "getGenericKbaSplashTestTag$annotations", "()V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class GenericKbaComposable {
    public static final String GenericKbaSplashTestTag = "GenericKbaSplashTestTag";

    /* compiled from: GenericKbaComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericKbaScreen.Field.Type.values().length];
            try {
                iArr[GenericKbaScreen.Field.Type.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericKbaScreen.Field.Type.SSN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenericKbaScreen.Field.Type.PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GenericKbaScreen.Field.Type.PLAIN_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericKbaComposable$lambda$5(GenericKbaDuxo genericKbaDuxo, String str, String str2, ImmutableList immutableList, String str3, String str4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GenericKbaComposable(genericKbaDuxo, str, str2, immutableList, str3, str4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$17(String str, String str2, ImmutableList immutableList, ImmutableList immutableList2, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(str, str2, immutableList, immutableList2, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGenericKbaSplashTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericKbaComposable(final GenericKbaDuxo duxo, final String heading, final String subheading, final ImmutableList<GenericKbaScreen.Field> fields, final String primaryCtaText, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        final Modifier modifier2;
        final FragmentActivity fragmentActivity;
        Event<GenericKbaEvent> event;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Composer composer2;
        Object objRememberedValue;
        final Event<GenericKbaEvent> eventGenericKbaComposable$lambda$1;
        SnapshotState4 snapshotState4;
        final Event<GenericKbaEvent> eventGenericKbaComposable$lambda$12;
        EventConsumer<GenericKbaEvent> eventConsumerInvoke;
        EventConsumer<GenericKbaEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Composer composerStartRestartGroup = composer.startRestartGroup(440814944);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(heading) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(subheading) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fields) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryCtaText) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
            }
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(440814944, i3, -1, "com.robinhood.shared.stepupverification.kba.GenericKbaComposable (GenericKbaComposable.kt:73)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                fragmentActivity = (FragmentActivity) objConsume;
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<GenericKbaEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "GenericKbaComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof GenericKbaEvent) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<GenericKbaEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof GenericKbaEvent)) {
                    value = null;
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    int size = fields.size();
                    String[] strArr = new String[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        strArr[i5] = "";
                    }
                    objRememberedValue = SnapshotStateKt.mutableStateListOf(strArr);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
                composer2.endReplaceGroup();
                eventGenericKbaComposable$lambda$1 = GenericKbaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle);
                if (eventGenericKbaComposable$lambda$1 == null && (eventGenericKbaComposable$lambda$1.getData() instanceof GenericKbaEvent.Error) && (eventConsumerInvoke2 = eventGenericKbaComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    eventConsumerInvoke2.consume(eventGenericKbaComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25717invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25717invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            WorkflowErrorResponses.handleWorkflowError$default(fragmentActivity, ((GenericKbaEvent.Error) eventGenericKbaComposable$lambda$1.getData()).getThrowable(), 0, 2, null);
                        }
                    });
                } else {
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                }
                eventGenericKbaComposable$lambda$12 = GenericKbaComposable$lambda$1(snapshotState4);
                if (eventGenericKbaComposable$lambda$12 != null && (eventGenericKbaComposable$lambda$12.getData() instanceof GenericKbaEvent.Exit) && (eventConsumerInvoke = eventGenericKbaComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventGenericKbaComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25718invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25718invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.finishWithResult$default(fragmentActivity, UiWorkflowStatus.DENIED, 0, 2, null);
                        }
                    });
                }
                Modifier modifier4 = modifier3;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-792702635, true, new C398653(snapshotStateList, current, userInteractionEventDescriptor, duxo, primaryCtaText, str2, snapshotState4CollectAsStateWithLifecycle2, fields), composer2, 54), ComposableLambda3.rememberComposableLambda(1837091400, true, new C398664(heading, subheading, fields, snapshotStateList), composer2, 54), composer2, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericKbaComposable.GenericKbaComposable$lambda$5(duxo, heading, subheading, fields, primaryCtaText, str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            fragmentActivity = (FragmentActivity) objConsume2;
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "GenericKbaComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof GenericKbaEvent) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<GenericKbaEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof GenericKbaEvent)) {
            }
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue;
            composer2.endReplaceGroup();
            eventGenericKbaComposable$lambda$1 = GenericKbaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle);
            if (eventGenericKbaComposable$lambda$1 == null) {
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                eventGenericKbaComposable$lambda$12 = GenericKbaComposable$lambda$1(snapshotState4);
                if (eventGenericKbaComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventGenericKbaComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25718invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25718invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.finishWithResult$default(fragmentActivity, UiWorkflowStatus.DENIED, 0, 2, null);
                        }
                    });
                }
                Modifier modifier42 = modifier3;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-792702635, true, new C398653(snapshotStateList2, current2, userInteractionEventDescriptor2, duxo, primaryCtaText, str2, snapshotState4CollectAsStateWithLifecycle22, fields), composer2, 54), ComposableLambda3.rememberComposableLambda(1837091400, true, new C398664(heading, subheading, fields, snapshotStateList2), composer2, 54), composer2, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericKbaViewState GenericKbaComposable$lambda$0(SnapshotState4<GenericKbaViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<GenericKbaEvent> GenericKbaComposable$lambda$1(SnapshotState4<Event<GenericKbaEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: GenericKbaComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$4 */
    static final class C398664 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<GenericKbaScreen.Field> $fields;
        final /* synthetic */ String $heading;
        final /* synthetic */ SnapshotStateList<String> $inputTexts;
        final /* synthetic */ String $subheading;

        C398664(String str, String str2, ImmutableList<GenericKbaScreen.Field> immutableList, SnapshotStateList<String> snapshotStateList) {
            this.$heading = str;
            this.$subheading = str2;
            this.$fields = immutableList;
            this.$inputTexts = snapshotStateList;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837091400, i, -1, "com.robinhood.shared.stepupverification.kba.GenericKbaComposable.<anonymous> (GenericKbaComposable.kt:94)");
            }
            String str = this.$heading;
            String str2 = this.$subheading;
            ImmutableList<GenericKbaScreen.Field> immutableList = this.$fields;
            ImmutableList immutableList2 = extensions2.toImmutableList(this.$inputTexts);
            composer.startReplaceGroup(5004770);
            final SnapshotStateList<String> snapshotStateList = this.$inputTexts;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericKbaComposable.C398664.invoke$lambda$1$lambda$0(snapshotStateList, ((Integer) obj).intValue(), (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GenericKbaComposable.MainContent(str, str2, immutableList, immutableList2, (Function2) objRememberedValue, null, composer, 24576, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotStateList snapshotStateList, int i, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            snapshotStateList.set(i, value);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GenericKbaComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$3 */
    static final class C398653 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ GenericKbaDuxo $duxo;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ ImmutableList<GenericKbaScreen.Field> $fields;
        final /* synthetic */ SnapshotStateList<String> $inputTexts;
        final /* synthetic */ String $primaryCtaText;
        final /* synthetic */ String $secondaryCtaText;
        final /* synthetic */ SnapshotState4<GenericKbaViewState> $viewState$delegate;

        C398653(SnapshotStateList<String> snapshotStateList, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, GenericKbaDuxo genericKbaDuxo, String str, String str2, SnapshotState4<GenericKbaViewState> snapshotState4, ImmutableList<GenericKbaScreen.Field> immutableList) {
            this.$inputTexts = snapshotStateList;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$duxo = genericKbaDuxo;
            this.$primaryCtaText = str;
            this.$secondaryCtaText = str2;
            this.$viewState$delegate = snapshotState4;
            this.$fields = immutableList;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792702635, i, -1, "com.robinhood.shared.stepupverification.kba.GenericKbaComposable.<anonymous> (GenericKbaComposable.kt:103)");
            }
            boolean zIsLoading = GenericKbaComposable.GenericKbaComposable$lambda$0(this.$viewState$delegate).isLoading();
            Iterable iterableWithIndex = CollectionsKt.withIndex(this.$inputTexts);
            ImmutableList<GenericKbaScreen.Field> immutableList = this.$fields;
            boolean z = true;
            if (!(iterableWithIndex instanceof Collection) || !((Collection) iterableWithIndex).isEmpty()) {
                Iterator it = iterableWithIndex.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) it.next();
                    if (!GenericKbaComposable.isValid((String) indexedValue.component2(), immutableList.get(indexedValue.getIndex()).getType())) {
                        z = false;
                        break;
                    }
                }
            }
            boolean z2 = z;
            boolean zIsLoading2 = GenericKbaComposable.GenericKbaComposable$lambda$0(this.$viewState$delegate).isLoading();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final GenericKbaDuxo genericKbaDuxo = this.$duxo;
            final SnapshotStateList<String> snapshotStateList = this.$inputTexts;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericKbaComposable.C398653.invoke$lambda$2$lambda$1(eventLogger, userInteractionEventDescriptor, genericKbaDuxo, snapshotStateList);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            String str = this.$primaryCtaText;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger2 = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            final GenericKbaDuxo genericKbaDuxo2 = this.$duxo;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$GenericKbaComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenericKbaComposable.C398653.invoke$lambda$4$lambda$3(eventLogger2, userInteractionEventDescriptor2, genericKbaDuxo2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, str, zIsLoading, null, z2, (Function0) objRememberedValue2, this.$secondaryCtaText, zIsLoading2, null, false, composer, 0, 0, 49727);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, GenericKbaDuxo genericKbaDuxo, SnapshotStateList snapshotStateList) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.PRIMARY_CTA, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            genericKbaDuxo.onPrimaryCtaClicked(snapshotStateList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, GenericKbaDuxo genericKbaDuxo) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SECONDARY_CTA, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            genericKbaDuxo.onSecondaryCtaClicked();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final String str, final String str2, final ImmutableList<GenericKbaScreen.Field> immutableList, final ImmutableList<String> immutableList2, final Function2<? super Integer, ? super String, Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        final FocusManager focusManager;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ImmutableList<String> immutableList3 = immutableList2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1253263779);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(immutableList3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1253263779, i3, -1, "com.robinhood.shared.stepupverification.kba.MainContent (GenericKbaComposable.kt:138)");
                    }
                    focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        int size = immutableList.size();
                        Boolean[] boolArr = new Boolean[size];
                        for (int i5 = 0; i5 < size; i5++) {
                            boolArr[i5] = Boolean.FALSE;
                        }
                        objRememberedValue = SnapshotStateKt.mutableStateListOf(boolArr);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new GenericKbaComposable2(focusManager);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierVerticalScroll$default, unit, (PointerInputEventHandler) objRememberedValue2);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    Modifier modifierTestTag = TestTag3.testTag(companion2, GenericKbaSplashTestTag);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    int i7 = i3;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C20682R.drawable.svg_ic_success_illustration, composerStartRestartGroup, 0), (String) null, SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, i7 & 14, 0, 8126);
                    BentoText2.m20747BentoText38GnDrw(str2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, (i7 >> 3) & 14, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(178696118);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                    final int i8 = 0;
                    for (GenericKbaScreen.Field field : immutableList) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final GenericKbaScreen.Field field2 = field;
                        String str3 = immutableList3.get(i8);
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(i8);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GenericKbaComposable.MainContent$lambda$16$lambda$15$lambda$9$lambda$8(snapshotStateList, i8, (FocusState) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3);
                        String name = field2.getName();
                        String placeholder = field2.getPlaceholder();
                        composerStartRestartGroup.startReplaceGroup(178718300);
                        BentoTextInput8.Message.Error error = (((Boolean) snapshotStateList.get(i8)).booleanValue() || str3.length() <= 0 || isValid(str3, field2.getType())) ? null : new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(getError(field2.getType()), new Object[]{field2.getName()}, composerStartRestartGroup, 0));
                        composerStartRestartGroup.endReplaceGroup();
                        KeyboardOptions keyboardOptions = getKeyboardOptions(field2.getType(), i8 == CollectionsKt.getLastIndex(immutableList));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(focusManager);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GenericKbaComposable.MainContent$lambda$16$lambda$15$lambda$11$lambda$10(focusManager, (KeyboardActions2) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        KeyboardActions keyboardActions = new KeyboardActions((Function1) objRememberedValue4, null, null, null, null, null, 62, null);
                        VisualTransformation visualTransformation = getVisualTransformation(field2.getType(), ((Boolean) snapshotStateList.get(i8)).booleanValue());
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(field2) | ((i7 & 57344) == 16384) | composerStartRestartGroup.changed(i8);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GenericKbaComposable.MainContent$lambda$16$lambda$15$lambda$14$lambda$13(field2, function2, i8, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoTextInput4.BentoTextInput(str3, (Function1) objRememberedValue5, modifierOnFocusChanged, name, placeholder, null, error, null, null, null, keyboardOptions, keyboardActions, visualTransformation, false, false, composer2, BentoTextInput8.Message.Error.$stable << 18, 0, 25504);
                        composerStartRestartGroup = composer2;
                        arrayList.add(Unit.INSTANCE);
                        immutableList3 = immutableList2;
                        i8 = i9;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kba.GenericKbaComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GenericKbaComposable.MainContent$lambda$17(str, str2, immutableList, immutableList2, function2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(focusManager);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new GenericKbaComposable2(focusManager);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierVerticalScroll$default2, unit2, (PointerInputEventHandler) objRememberedValue2);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        Modifier modifierTestTag2 = TestTag3.testTag(companion22, GenericKbaSplashTestTag);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifier52 = modifier4;
                        int i72 = i3;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C20682R.drawable.svg_ic_success_illustration, composerStartRestartGroup, 0), (String) null, SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                        TextAlign.Companion companion32 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, i72 & 14, 0, 8126);
                        BentoText2.m20747BentoText38GnDrw(str2, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, (i72 >> 3) & 14, 0, 8124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(178696118);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
                        final int i82 = 0;
                        while (r6.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Spacer2.Spacer(Column5.weight$default(column62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$16$lambda$15$lambda$9$lambda$8(SnapshotStateList snapshotStateList, int i, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotStateList.set(i, Boolean.valueOf(it.isFocused()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$16$lambda$15$lambda$14$lambda$13(GenericKbaScreen.Field field, Function2 function2, int i, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= getMaxLength(field.getType())) {
            if (field.getType() == GenericKbaScreen.Field.Type.PLAIN_TEXT) {
                function2.invoke(Integer.valueOf(i), it);
            } else {
                for (int i2 = 0; i2 < it.length(); i2++) {
                    if (!Character.isDigit(it.charAt(i2))) {
                        break;
                    }
                }
                function2.invoke(Integer.valueOf(i), it);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$16$lambda$15$lambda$11$lambda$10(FocusManager focusManager, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    private static final int getMaxLength(GenericKbaScreen.Field.Type type2) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 9;
        }
        if (i == 3) {
            return 10;
        }
        if (i == 4) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int getError(GenericKbaScreen.Field.Type type2) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return C39791R.string.kba_date_of_birth_invalid_error;
        }
        if (i == 2) {
            return C39791R.string.kba_ssn_invalid_error;
        }
        if (i == 3) {
            return C39791R.string.generic_kba_phone_invalid_error;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(type2);
        throw new ExceptionsH();
    }

    private static final KeyboardOptions getKeyboardOptions(GenericKbaScreen.Field.Type type2, boolean z) {
        int iM7747getDoneeUduSuo = z ? ImeAction.INSTANCE.m7747getDoneeUduSuo() : ImeAction.INSTANCE.m7749getNexteUduSuo();
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), iM7747getDoneeUduSuo, null, null, null, 115, null);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7770getWordsIUNYP9k(), null, 0, iM7747getDoneeUduSuo, null, null, null, 118, null);
    }

    private static final VisualTransformation getVisualTransformation(GenericKbaScreen.Field.Type type2, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            return new DateOfBirthVisualTransformation(US, null, 2, null);
        }
        if (i == 2) {
            return new SsnVisualTransformation(z);
        }
        if (i == 3) {
            return new PhoneNumberVisualTransformation(InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null), false);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return VisualTransformation.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValid(String str, GenericKbaScreen.Field.Type type2) {
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return isValidDate(str);
        }
        if (i == 2) {
            return isValidSsn(str);
        }
        if (i == 3) {
            return isValidPhoneNumber(str);
        }
        if (i == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean isValidDate(String str) {
        if (str.length() == getMaxLength(GenericKbaScreen.Field.Type.DATE)) {
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (Integer.parseInt(strSubstring) <= 12) {
                String strSubstring2 = str.substring(2, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (Integer.parseInt(strSubstring2) <= 31) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean isValidPhoneNumber(String str) {
        return InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null).getValidatePhoneNumber().invoke(str).booleanValue();
    }

    private static final boolean isValidSsn(String str) {
        return str.length() == getMaxLength(GenericKbaScreen.Field.Type.SSN);
    }
}
