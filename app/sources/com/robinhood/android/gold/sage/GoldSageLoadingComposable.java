package com.robinhood.android.gold.sage;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.gold.sage.GoldSageLoadingEvent;
import com.robinhood.android.gold.sage.data.GoldSageFlow;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import gold.proto.p464v1.GoldSageSplash;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: GoldSageLoadingComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001ag\u0010\u0000\u001a\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"GoldSageLoadingComposable", "", "onSuccess", "Lkotlin/Function1;", "Lcom/robinhood/android/gold/sage/data/GoldSageFlow;", "Lkotlin/ParameterName;", "name", "response", "onFailure", "", "error", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/gold/sage/GoldSageLoadingDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-gold-sage_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/gold/sage/GoldSageLoadingEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageLoadingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageLoadingComposable$lambda$7(Function1 function1, Function1 function12, Modifier modifier, GoldSageLoadingDuxo goldSageLoadingDuxo, int i, int i2, Composer composer, int i3) {
        GoldSageLoadingComposable(function1, function12, modifier, goldSageLoadingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageLoadingComposable(final Function1<? super GoldSageFlow, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure, Modifier modifier, GoldSageLoadingDuxo goldSageLoadingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GoldSageLoadingDuxo goldSageLoadingDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        GoldSageLoadingDuxo goldSageLoadingDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        final Event<GoldSageLoadingEvent> eventGoldSageLoadingComposable$lambda$0;
        final Event<GoldSageLoadingEvent> eventGoldSageLoadingComposable$lambda$02;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer3;
        final GoldSageLoadingDuxo goldSageLoadingDuxo4;
        final Modifier modifier4;
        EventConsumer<GoldSageLoadingEvent> eventConsumerInvoke;
        EventConsumer<GoldSageLoadingEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Composer composerStartRestartGroup = composer.startRestartGroup(1582207869);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSuccess) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFailure) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    goldSageLoadingDuxo2 = goldSageLoadingDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(goldSageLoadingDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    goldSageLoadingDuxo2 = goldSageLoadingDuxo;
                }
                i3 |= i6;
            } else {
                goldSageLoadingDuxo2 = goldSageLoadingDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
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
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GoldSageLoadingDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 = i3 & (-7169);
                        goldSageLoadingDuxo3 = (GoldSageLoadingDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        goldSageLoadingDuxo3 = goldSageLoadingDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    goldSageLoadingDuxo3 = goldSageLoadingDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582207869, i4, -1, "com.robinhood.android.gold.sage.GoldSageLoadingComposable (GoldSageLoadingComposable.kt:16)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(goldSageLoadingDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                eventGoldSageLoadingComposable$lambda$0 = GoldSageLoadingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventGoldSageLoadingComposable$lambda$0 != null && (eventGoldSageLoadingComposable$lambda$0.getData() instanceof GoldSageLoadingEvent.Success) && (eventConsumerInvoke2 = eventGoldSageLoadingComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventGoldSageLoadingComposable$lambda$0, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15069invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15069invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSuccess.invoke(((GoldSageLoadingEvent.Success) eventGoldSageLoadingComposable$lambda$0.getData()).getGoldSageFlow());
                        }
                    });
                }
                eventGoldSageLoadingComposable$lambda$02 = GoldSageLoadingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventGoldSageLoadingComposable$lambda$02 != null && (eventGoldSageLoadingComposable$lambda$02.getData() instanceof GoldSageLoadingEvent.Failure) && (eventConsumerInvoke = eventGoldSageLoadingComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventGoldSageLoadingComposable$lambda$02, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15070invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15070invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onFailure.invoke(((GoldSageLoadingEvent.Failure) eventGoldSageLoadingComposable$lambda$02.getData()).getError());
                        }
                    });
                }
                GoldSageSplash goldSageSplash = new GoldSageSplash(null, null, null, null, null, null, null, null, null, 511, null);
                composer4.startReplaceGroup(1849434622);
                objRememberedValue = composer4.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(1849434622);
                objRememberedValue2 = composer4.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldSageLoadingComposable.GoldSageLoadingComposable$lambda$6$lambda$5((String) obj);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue2);
                }
                composer4.endReplaceGroup();
                Modifier modifier5 = modifier3;
                GoldSageSplashComposable3.GoldSageSplashComposable(goldSageSplash, function0, (Function1) objRememberedValue2, modifier5, true, null, null, composer4, ((i4 << 3) & 7168) | 25008, 96);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                goldSageLoadingDuxo4 = goldSageLoadingDuxo3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                goldSageLoadingDuxo4 = goldSageLoadingDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSageLoadingComposable.GoldSageLoadingComposable$lambda$7(onSuccess, onFailure, modifier4, goldSageLoadingDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(goldSageLoadingDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                eventGoldSageLoadingComposable$lambda$0 = GoldSageLoadingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventGoldSageLoadingComposable$lambda$0 != null) {
                    eventConsumerInvoke2.consume(eventGoldSageLoadingComposable$lambda$0, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15069invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15069invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSuccess.invoke(((GoldSageLoadingEvent.Success) eventGoldSageLoadingComposable$lambda$0.getData()).getGoldSageFlow());
                        }
                    });
                }
                eventGoldSageLoadingComposable$lambda$02 = GoldSageLoadingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventGoldSageLoadingComposable$lambda$02 != null) {
                    eventConsumerInvoke.consume(eventGoldSageLoadingComposable$lambda$02, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageLoadingComposableKt$GoldSageLoadingComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15070invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15070invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onFailure.invoke(((GoldSageLoadingEvent.Failure) eventGoldSageLoadingComposable$lambda$02.getData()).getError());
                        }
                    });
                }
                GoldSageSplash goldSageSplash2 = new GoldSageSplash(null, null, null, null, null, null, null, null, null, 511, null);
                composer42.startReplaceGroup(1849434622);
                objRememberedValue = composer42.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer42.endReplaceGroup();
                composer42.startReplaceGroup(1849434622);
                objRememberedValue2 = composer42.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer42.endReplaceGroup();
                Modifier modifier52 = modifier3;
                GoldSageSplashComposable3.GoldSageSplashComposable(goldSageSplash2, function02, (Function1) objRememberedValue2, modifier52, true, null, null, composer42, ((i4 << 3) & 7168) | 25008, 96);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                goldSageLoadingDuxo4 = goldSageLoadingDuxo3;
                modifier4 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageLoadingComposable$lambda$6$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final Event<GoldSageLoadingEvent> GoldSageLoadingComposable$lambda$0(SnapshotState4<Event<GoldSageLoadingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
