package com.robinhood.android.gold.sage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.lib.sage.GoldSageBottomBar3;
import com.robinhood.android.gold.lib.sage.GoldSageScaffold3;
import com.robinhood.android.gold.sage.GoldSageStartApplicationComposable;
import com.robinhood.android.gold.sage.GoldSageStartApplicationEvent;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import gold.proto.p464v1.CreateSageApplicationResponse;
import gold.proto.p464v1.GoldSageMortgageOption;
import gold.proto.p464v1.GoldSageMortgageType;
import gold.proto.p464v1.GoldSageStartApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageStartApplicationComposable.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001aV\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0003¢\u0006\u0002\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\u0012\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, m3636d2 = {"GoldSageStartApplicationComposable", "", "content", "Lgold/proto/v1/GoldSageStartApplication;", "onStartApplicationSuccess", "Lkotlin/Function1;", "Lgold/proto/v1/CreateSageApplicationResponse;", "Lkotlin/ParameterName;", "name", "sageApplicationResponse", "onStartApplicationFailure", "", "error", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationDuxo;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "sageId", "", "(Lgold/proto/v1/GoldSageStartApplication;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/sage/GoldSageStartApplicationDuxo;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Content", "selectedType", "Lgold/proto/v1/GoldSageMortgageType;", "onClickSelectType", "type", "title", "descriptionMarkdown", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lgold/proto/v1/GoldSageMortgageOption;", "(Lgold/proto/v1/GoldSageMortgageType;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "ContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-gold-sage_externalRelease", "viewState", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageStartApplicationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$13(GoldSageMortgageType goldSageMortgageType, Function1 function1, String str, String str2, ImmutableList immutableList, int i, Composer composer, int i2) {
        Content(goldSageMortgageType, function1, str, str2, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentPreview$lambda$17(int i, Composer composer, int i2) {
        ContentPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageStartApplicationComposable$lambda$7(GoldSageStartApplication goldSageStartApplication, Function1 function1, Function1 function12, Modifier modifier, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, Screen screen, Context context, String str, int i, int i2, Composer composer, int i3) {
        GoldSageStartApplicationComposable(goldSageStartApplication, function1, function12, modifier, goldSageStartApplicationDuxo, screen, context, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageStartApplicationComposable(final GoldSageStartApplication content, final Function1<? super CreateSageApplicationResponse, Unit> onStartApplicationSuccess, final Function1<? super Throwable, Unit> onStartApplicationFailure, Modifier modifier, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, Screen screen, Context context, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GoldSageStartApplicationDuxo goldSageStartApplicationDuxo2;
        Screen screen2;
        int i4;
        Context context2;
        int i5;
        String str2;
        int i6;
        Screen screen3;
        final String str3;
        Context context3;
        Screen screen4;
        CreationExtras defaultViewModelCreationExtras;
        final Event<GoldSageStartApplicationEvent> eventGoldSageStartApplicationComposable$lambda$1;
        final Event<GoldSageStartApplicationEvent> eventGoldSageStartApplicationComposable$lambda$12;
        Object objRememberedValue;
        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo3;
        final String str4;
        final Screen screen5;
        final Context context4;
        final Modifier modifier3;
        EventConsumer<GoldSageStartApplicationEvent> eventConsumerInvoke;
        EventConsumer<GoldSageStartApplicationEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onStartApplicationSuccess, "onStartApplicationSuccess");
        Intrinsics.checkNotNullParameter(onStartApplicationFailure, "onStartApplicationFailure");
        Composer composerStartRestartGroup = composer.startRestartGroup(1398310015);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStartApplicationSuccess) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStartApplicationFailure) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(goldSageStartApplicationDuxo2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
                }
                i3 |= i8;
            } else {
                goldSageStartApplicationDuxo2 = goldSageStartApplicationDuxo;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    screen2 = screen;
                    int i9 = composerStartRestartGroup.changedInstance(screen2) ? 131072 : 65536;
                    i3 |= i9;
                } else {
                    screen2 = screen;
                }
                i3 |= i9;
            } else {
                screen2 = screen;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    context2 = context;
                    i3 |= composerStartRestartGroup.changedInstance(context2) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 == 0) {
                    if ((12582912 & i) == 0) {
                        str2 = str;
                        i3 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 16) == 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                i6 = i5;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldSageStartApplicationDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                i3 &= -57345;
                                goldSageStartApplicationDuxo2 = (GoldSageStartApplicationDuxo) baseDuxo;
                            } else {
                                i6 = i5;
                            }
                            if ((i2 & 32) == 0) {
                                screen3 = new Screen(Screen.Name.GOLD_SAGE_START_APPLICATION, null, null, null, 14, null);
                                i3 &= -458753;
                            } else {
                                screen3 = screen;
                            }
                            Context context5 = i4 == 0 ? null : context;
                            if (i6 == 0) {
                                context3 = context5;
                                str3 = null;
                            } else {
                                str3 = str;
                                context3 = context5;
                            }
                            screen4 = screen3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            screen4 = screen2;
                            context3 = context2;
                            str3 = str2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1398310015, i3, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable (GoldSageStartApplicationComposable.kt:47)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        eventGoldSageStartApplicationComposable$lambda$1 = GoldSageStartApplicationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventGoldSageStartApplicationComposable$lambda$1 != null && (eventGoldSageStartApplicationComposable$lambda$1.getData() instanceof GoldSageStartApplicationEvent.Success) && (eventConsumerInvoke2 = eventGoldSageStartApplicationComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventGoldSageStartApplicationComposable$lambda$1, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15079invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15079invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onStartApplicationSuccess.invoke(((GoldSageStartApplicationEvent.Success) eventGoldSageStartApplicationComposable$lambda$1.getData()).getSageApplicationResponse());
                                }
                            });
                        }
                        eventGoldSageStartApplicationComposable$lambda$12 = GoldSageStartApplicationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventGoldSageStartApplicationComposable$lambda$12 != null && (eventGoldSageStartApplicationComposable$lambda$12.getData() instanceof GoldSageStartApplicationEvent.Failure) && (eventConsumerInvoke = eventGoldSageStartApplicationComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventGoldSageStartApplicationComposable$lambda$12, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15080invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15080invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onStartApplicationFailure.invoke(((GoldSageStartApplicationEvent.Failure) eventGoldSageStartApplicationComposable$lambda$12.getData()).getError());
                                }
                            });
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(GoldSageMortgageType.NEW, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo4 = goldSageStartApplicationDuxo2;
                        final Modifier modifier4 = modifier2;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1802914154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1802914154, i10, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous> (GoldSageStartApplicationComposable.kt:66)");
                                }
                                final Modifier modifier5 = modifier4;
                                final GoldSageStartApplication goldSageStartApplication = content;
                                final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo5 = goldSageStartApplicationDuxo4;
                                final String str5 = str3;
                                final SnapshotState<GoldSageMortgageType> snapshotState2 = snapshotState;
                                final SnapshotState4<GoldSageStartApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(1800183031, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.3.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: GoldSageStartApplicationComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C501721 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                        final /* synthetic */ GoldSageStartApplication $content;
                                        final /* synthetic */ GoldSageStartApplicationDuxo $duxo;
                                        final /* synthetic */ String $sageId;
                                        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;
                                        final /* synthetic */ SnapshotState4<GoldSageStartApplicationViewState> $viewState$delegate;

                                        C501721(GoldSageStartApplication goldSageStartApplication, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, String str, SnapshotState<GoldSageMortgageType> snapshotState, SnapshotState4<GoldSageStartApplicationViewState> snapshotState4) {
                                            this.$content = goldSageStartApplication;
                                            this.$duxo = goldSageStartApplicationDuxo;
                                            this.$sageId = str;
                                            this.$selectedType$delegate = snapshotState;
                                            this.$viewState$delegate = snapshotState4;
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
                                                ComposerKt.traceEventStart(-1191530974, i, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:69)");
                                            }
                                            String cta_text = this.$content.getCta_text();
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$sageId);
                                            final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo = this.$duxo;
                                            final String str = this.$sageId;
                                            final SnapshotState<GoldSageMortgageType> snapshotState = this.$selectedType$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return GoldSageStartApplicationComposable.C178963.AnonymousClass1.C501721.invoke$lambda$1$lambda$0(goldSageStartApplicationDuxo, str, snapshotState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            GoldSageBottomBar3.GoldSageBottomBar(cta_text, (Function0) objRememberedValue, null, this.$content.getCta_icon(), this.$content.getCta_disclosure(), null, null, GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$0(this.$viewState$delegate).isLoading(), composer, 0, 100);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, String str, SnapshotState snapshotState) {
                                            goldSageStartApplicationDuxo.onStartApplication(GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$5(snapshotState), str);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i11) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i11 & 6) == 0) {
                                            i11 |= composer3.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1800183031, i11, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:67)");
                                        }
                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(PaddingKt.padding(modifier5, paddingValues), null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1191530974, true, new C501721(goldSageStartApplication, goldSageStartApplicationDuxo5, str5, snapshotState2, snapshotState4), composer3, 54), ComposableLambda3.rememberComposableLambda(1427443983, true, new AnonymousClass2(goldSageStartApplication, snapshotState2), composer3, 54), composer3, 3504, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: GoldSageStartApplicationComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                        final /* synthetic */ GoldSageStartApplication $content;
                                        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;

                                        AnonymousClass2(GoldSageStartApplication goldSageStartApplication, SnapshotState<GoldSageMortgageType> snapshotState) {
                                            this.$content = goldSageStartApplication;
                                            this.$selectedType$delegate = snapshotState;
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
                                                ComposerKt.traceEventStart(1427443983, i, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:82)");
                                            }
                                            GoldSageMortgageType goldSageMortgageTypeGoldSageStartApplicationComposable$lambda$5 = GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$5(this.$selectedType$delegate);
                                            composer.startReplaceGroup(5004770);
                                            final SnapshotState<GoldSageMortgageType> snapshotState = this.$selectedType$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return GoldSageStartApplicationComposable.C178963.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (GoldSageMortgageType) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            GoldSageStartApplicationComposable.Content(goldSageMortgageTypeGoldSageStartApplicationComposable$lambda$5, (Function1) objRememberedValue, this.$content.getTitle(), this.$content.getDescription_markdown(), extensions2.toPersistentList(this.$content.getOptions()), composer, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, GoldSageMortgageType it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$6(snapshotState, it);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        goldSageStartApplicationDuxo3 = goldSageStartApplicationDuxo4;
                        str4 = str3;
                        screen5 = screen4;
                        context4 = context3;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        goldSageStartApplicationDuxo3 = goldSageStartApplicationDuxo2;
                        screen5 = screen2;
                        context4 = context2;
                        str4 = str2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$7(content, onStartApplicationSuccess, onStartApplicationFailure, modifier3, goldSageStartApplicationDuxo3, screen5, context4, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                str2 = str;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        screen4 = screen3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final SnapshotState4<GoldSageStartApplicationViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(goldSageStartApplicationDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        eventGoldSageStartApplicationComposable$lambda$1 = GoldSageStartApplicationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventGoldSageStartApplicationComposable$lambda$1 != null) {
                            eventConsumerInvoke2.consume(eventGoldSageStartApplicationComposable$lambda$1, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15079invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15079invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onStartApplicationSuccess.invoke(((GoldSageStartApplicationEvent.Success) eventGoldSageStartApplicationComposable$lambda$1.getData()).getSageApplicationResponse());
                                }
                            });
                        }
                        eventGoldSageStartApplicationComposable$lambda$12 = GoldSageStartApplicationComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventGoldSageStartApplicationComposable$lambda$12 != null) {
                            eventConsumerInvoke.consume(eventGoldSageStartApplicationComposable$lambda$12, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15080invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15080invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onStartApplicationFailure.invoke(((GoldSageStartApplicationEvent.Failure) eventGoldSageStartApplicationComposable$lambda$12.getData()).getError());
                                }
                            });
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final SnapshotState<GoldSageMortgageType> snapshotState2 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo42 = goldSageStartApplicationDuxo2;
                        final Modifier modifier42 = modifier2;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen4, null, context3, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1802914154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1802914154, i10, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous> (GoldSageStartApplicationComposable.kt:66)");
                                }
                                final Modifier modifier5 = modifier42;
                                final GoldSageStartApplication goldSageStartApplication = content;
                                final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo5 = goldSageStartApplicationDuxo42;
                                final String str5 = str3;
                                final SnapshotState<GoldSageMortgageType> snapshotState22 = snapshotState2;
                                final SnapshotState4<GoldSageStartApplicationViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                                GoldSageScaffold3.GoldSageScaffold(null, ComposableLambda3.rememberComposableLambda(1800183031, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt.GoldSageStartApplicationComposable.3.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: GoldSageStartApplicationComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$1, reason: invalid class name and collision with other inner class name */
                                    static final class C501721 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                        final /* synthetic */ GoldSageStartApplication $content;
                                        final /* synthetic */ GoldSageStartApplicationDuxo $duxo;
                                        final /* synthetic */ String $sageId;
                                        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;
                                        final /* synthetic */ SnapshotState4<GoldSageStartApplicationViewState> $viewState$delegate;

                                        C501721(GoldSageStartApplication goldSageStartApplication, GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, String str, SnapshotState<GoldSageMortgageType> snapshotState, SnapshotState4<GoldSageStartApplicationViewState> snapshotState4) {
                                            this.$content = goldSageStartApplication;
                                            this.$duxo = goldSageStartApplicationDuxo;
                                            this.$sageId = str;
                                            this.$selectedType$delegate = snapshotState;
                                            this.$viewState$delegate = snapshotState4;
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
                                                ComposerKt.traceEventStart(-1191530974, i, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:69)");
                                            }
                                            String cta_text = this.$content.getCta_text();
                                            composer.startReplaceGroup(-1746271574);
                                            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$sageId);
                                            final GoldSageStartApplicationDuxo goldSageStartApplicationDuxo = this.$duxo;
                                            final String str = this.$sageId;
                                            final SnapshotState snapshotState = this.$selectedType$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return GoldSageStartApplicationComposable.C178963.AnonymousClass1.C501721.invoke$lambda$1$lambda$0(goldSageStartApplicationDuxo, str, snapshotState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            GoldSageBottomBar3.GoldSageBottomBar(cta_text, (Function0) objRememberedValue, null, this.$content.getCta_icon(), this.$content.getCta_disclosure(), null, null, GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$0(this.$viewState$delegate).isLoading(), composer, 0, 100);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(GoldSageStartApplicationDuxo goldSageStartApplicationDuxo, String str, SnapshotState snapshotState) {
                                            goldSageStartApplicationDuxo.onStartApplication(GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$5(snapshotState), str);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i11) {
                                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                        if ((i11 & 6) == 0) {
                                            i11 |= composer3.changed(paddingValues) ? 4 : 2;
                                        }
                                        if ((i11 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1800183031, i11, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:67)");
                                        }
                                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(PaddingKt.padding(modifier5, paddingValues), null, 1, null), false, ComposableLambda3.rememberComposableLambda(-1191530974, true, new C501721(goldSageStartApplication, goldSageStartApplicationDuxo5, str5, snapshotState22, snapshotState4), composer3, 54), ComposableLambda3.rememberComposableLambda(1427443983, true, new AnonymousClass2(goldSageStartApplication, snapshotState22), composer3, 54), composer3, 3504, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: GoldSageStartApplicationComposable.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$2, reason: invalid class name */
                                    static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                        final /* synthetic */ GoldSageStartApplication $content;
                                        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;

                                        AnonymousClass2(GoldSageStartApplication goldSageStartApplication, SnapshotState<GoldSageMortgageType> snapshotState) {
                                            this.$content = goldSageStartApplication;
                                            this.$selectedType$delegate = snapshotState;
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
                                                ComposerKt.traceEventStart(1427443983, i, -1, "com.robinhood.android.gold.sage.GoldSageStartApplicationComposable.<anonymous>.<anonymous>.<anonymous> (GoldSageStartApplicationComposable.kt:82)");
                                            }
                                            GoldSageMortgageType goldSageMortgageTypeGoldSageStartApplicationComposable$lambda$5 = GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$5(this.$selectedType$delegate);
                                            composer.startReplaceGroup(5004770);
                                            final SnapshotState snapshotState = this.$selectedType$delegate;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$3$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return GoldSageStartApplicationComposable.C178963.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(snapshotState, (GoldSageMortgageType) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            GoldSageStartApplicationComposable.Content(goldSageMortgageTypeGoldSageStartApplicationComposable$lambda$5, (Function1) objRememberedValue, this.$content.getTitle(), this.$content.getDescription_markdown(), extensions2.toPersistentList(this.$content.getOptions()), composer, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, GoldSageMortgageType it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            GoldSageStartApplicationComposable.GoldSageStartApplicationComposable$lambda$6(snapshotState, it);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer2, 54), composer2, 48, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        goldSageStartApplicationDuxo3 = goldSageStartApplicationDuxo42;
                        str4 = str3;
                        screen5 = screen4;
                        context4 = context3;
                        modifier3 = modifier42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            context2 = context;
            i5 = i2 & 128;
            if (i5 == 0) {
            }
            str2 = str;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        context2 = context;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        str2 = str;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageMortgageType ContentPreview$lambda$15(SnapshotState<GoldSageMortgageType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageStartApplicationViewState GoldSageStartApplicationComposable$lambda$0(SnapshotState4<GoldSageStartApplicationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<GoldSageStartApplicationEvent> GoldSageStartApplicationComposable$lambda$1(SnapshotState4<Event<GoldSageStartApplicationEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldSageMortgageType GoldSageStartApplicationComposable$lambda$5(SnapshotState<GoldSageMortgageType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(final GoldSageMortgageType goldSageMortgageType, final Function1<? super GoldSageMortgageType, Unit> function1, final String str, final String str2, final ImmutableList<GoldSageMortgageOption> immutableList, Composer composer, final int i) {
        String str3;
        String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-245478357);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(goldSageMortgageType.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245478357, i2, -1, "com.robinhood.android.gold.sage.Content (GoldSageStartApplicationComposable.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, (i2 >> 6) & 14, 0, 8190);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoMarkdownText2.BentoMarkdownText(str4, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, (i2 >> 9) & 14, 30);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-1481616461);
            for (final GoldSageMortgageOption goldSageMortgageOption : immutableList) {
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String title = goldSageMortgageOption.getTitle();
                boolean z = goldSageMortgageType == goldSageMortgageOption.getMortgage_type();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(goldSageMortgageOption) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSageStartApplicationComposable.Content$lambda$12$lambda$11$lambda$10$lambda$9(function1, goldSageMortgageOption);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer2 = composerStartRestartGroup;
                BentoSelectionRow2.BentoSelectionRow(null, type2, title, z, null, false, null, false, false, false, (Function0) objRememberedValue, composer2, 48, 0, 1009);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageStartApplicationComposable.Content$lambda$13(goldSageMortgageType, function1, str, str2, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContentPreview$lambda$16(SnapshotState<GoldSageMortgageType> snapshotState, GoldSageMortgageType goldSageMortgageType) {
        snapshotState.setValue(goldSageMortgageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldSageStartApplicationComposable$lambda$6(SnapshotState<GoldSageMortgageType> snapshotState, GoldSageMortgageType goldSageMortgageType) {
        snapshotState.setValue(goldSageMortgageType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$12$lambda$11$lambda$10$lambda$9(Function1 function1, GoldSageMortgageOption goldSageMortgageOption) {
        function1.invoke(goldSageMortgageOption.getMortgage_type());
        return Unit.INSTANCE;
    }

    private static final void ContentPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1117538358);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1117538358, i, -1, "com.robinhood.android.gold.sage.ContentPreview (GoldSageStartApplicationComposable.kt:123)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(GoldSageMortgageType.NEW, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1023414766, true, new C178951((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageStartApplicationComposable.ContentPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSageStartApplicationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$ContentPreview$1 */
    static final class C178951 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<GoldSageMortgageType> $selectedType$delegate;

        C178951(SnapshotState<GoldSageMortgageType> snapshotState) {
            this.$selectedType$delegate = snapshotState;
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
                ComposerKt.traceEventStart(1023414766, i, -1, "com.robinhood.android.gold.sage.ContentPreview.<anonymous> (GoldSageStartApplicationComposable.kt:127)");
            }
            GoldSageMortgageType goldSageMortgageTypeContentPreview$lambda$15 = GoldSageStartApplicationComposable.ContentPreview$lambda$15(this.$selectedType$delegate);
            composer.startReplaceGroup(5004770);
            final SnapshotState<GoldSageMortgageType> snapshotState = this.$selectedType$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageStartApplicationComposableKt$ContentPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageStartApplicationComposable.C178951.invoke$lambda$1$lambda$0(snapshotState, (GoldSageMortgageType) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldSageStartApplicationComposable.Content(goldSageMortgageTypeContentPreview$lambda$15, (Function1) objRememberedValue, "First step—what’s your goal?", "Tell us more about your home ownership goal to kick off your application with Sage.", extensions2.persistentListOf(new GoldSageMortgageOption("I’m buying a new home", GoldSageMortgageType.NEW, null, 4, null), new GoldSageMortgageOption("I’m refinancing my home", GoldSageMortgageType.REFINANCE, null, 4, null)), composer, 3504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, GoldSageMortgageType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            GoldSageStartApplicationComposable.ContentPreview$lambda$16(snapshotState, it);
            return Unit.INSTANCE;
        }
    }
}
