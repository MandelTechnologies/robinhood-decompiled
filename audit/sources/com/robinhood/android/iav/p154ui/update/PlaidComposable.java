package com.robinhood.android.iav.p154ui.update;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.robinhood.android.iav.p154ui.update.PlaidEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PlaidComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"PlaidComposable", "", "duxo", "Lcom/robinhood/android/iav/ui/update/PlaidDuxo;", "onShowPostTransferPages", "Lkotlin/Function1;", "", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage;", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/iav/ui/update/PlaidDuxo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-iav_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/iav/ui/update/PlaidEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.iav.ui.update.PlaidComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PlaidComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaidComposable$lambda$5(PlaidDuxo plaidDuxo, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaidComposable(plaidDuxo, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlaidComposable(final PlaidDuxo duxo, final Function1<? super List<? extends ApiPostTransferPage>, Unit> onShowPostTransferPages, final Function1<? super Throwable, Unit> onError, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult;
        final Event<PlaidEvent> eventPlaidComposable$lambda$0;
        final Event<PlaidEvent> eventPlaidComposable$lambda$02;
        final Event<PlaidEvent> eventPlaidComposable$lambda$03;
        EventConsumer<PlaidEvent> eventConsumerInvoke;
        EventConsumer<PlaidEvent> eventConsumerInvoke2;
        EventConsumer<PlaidEvent> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onShowPostTransferPages, "onShowPostTransferPages");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1344859838);
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
            i3 |= composerStartRestartGroup.changedInstance(onShowPostTransferPages) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1344859838, i3, -1, "com.robinhood.android.iav.ui.update.PlaidComposable (PlaidComposable.kt:19)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                OpenPlaidLink openPlaidLink = new OpenPlaidLink();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PlaidComposable3(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(openPlaidLink, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
                eventPlaidComposable$lambda$0 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventPlaidComposable$lambda$0 != null && (eventPlaidComposable$lambda$0.getData() instanceof PlaidEvent.LaunchSdk) && (eventConsumerInvoke3 = eventPlaidComposable$lambda$0.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventPlaidComposable$lambda$0, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15267invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15267invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            final String token = ((PlaidEvent.LaunchSdk) eventPlaidComposable$lambda$0.getData()).getToken();
                            activityResultRegistry8RememberLauncherForActivityResult.launch(PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1<LinkTokenConfiguration.Builder, Unit>() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LinkTokenConfiguration.Builder builder) {
                                    invoke2(builder);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LinkTokenConfiguration.Builder linkTokenConfiguration) {
                                    Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
                                    linkTokenConfiguration.setToken(token);
                                }
                            }));
                        }
                    });
                }
                eventPlaidComposable$lambda$02 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventPlaidComposable$lambda$02 != null && (eventPlaidComposable$lambda$02.getData() instanceof PlaidEvent.PostTransfer) && (eventConsumerInvoke2 = eventPlaidComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventPlaidComposable$lambda$02, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15268invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15268invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onShowPostTransferPages.invoke(((PlaidEvent.PostTransfer) eventPlaidComposable$lambda$02.getData()).component1());
                        }
                    });
                }
                eventPlaidComposable$lambda$03 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventPlaidComposable$lambda$03 != null && (eventPlaidComposable$lambda$03.getData() instanceof PlaidEvent.Error) && (eventConsumerInvoke = eventPlaidComposable$lambda$03.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventPlaidComposable$lambda$03, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15269invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15269invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke(((PlaidEvent.Error) eventPlaidComposable$lambda$03.getData()).getThrowable());
                        }
                    });
                }
                LoadingScreenComposablesKt.ShimmerLoadingComposable(ShimmerLoaderType.Boxes.INSTANCE, modifier3, composerStartRestartGroup, ((i3 >> 6) & 112) | ShimmerLoaderType.Boxes.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PlaidComposable.PlaidComposable$lambda$5(duxo, onShowPostTransferPages, onError, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            OpenPlaidLink openPlaidLink2 = new OpenPlaidLink();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new PlaidComposable3(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(openPlaidLink2, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
                eventPlaidComposable$lambda$0 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidComposable$lambda$0 != null) {
                    eventConsumerInvoke3.consume(eventPlaidComposable$lambda$0, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15267invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15267invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            final String token = ((PlaidEvent.LaunchSdk) eventPlaidComposable$lambda$0.getData()).getToken();
                            activityResultRegistry8RememberLauncherForActivityResult.launch(PlaidKotlinFunctionsKt.linkTokenConfiguration(new Function1<LinkTokenConfiguration.Builder, Unit>() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(LinkTokenConfiguration.Builder builder) {
                                    invoke2(builder);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LinkTokenConfiguration.Builder linkTokenConfiguration) {
                                    Intrinsics.checkNotNullParameter(linkTokenConfiguration, "$this$linkTokenConfiguration");
                                    linkTokenConfiguration.setToken(token);
                                }
                            }));
                        }
                    });
                }
                eventPlaidComposable$lambda$02 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidComposable$lambda$02 != null) {
                    eventConsumerInvoke2.consume(eventPlaidComposable$lambda$02, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15268invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15268invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onShowPostTransferPages.invoke(((PlaidEvent.PostTransfer) eventPlaidComposable$lambda$02.getData()).component1());
                        }
                    });
                }
                eventPlaidComposable$lambda$03 = PlaidComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventPlaidComposable$lambda$03 != null) {
                    eventConsumerInvoke.consume(eventPlaidComposable$lambda$03, new Function1() { // from class: com.robinhood.android.iav.ui.update.PlaidComposableKt$PlaidComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15269invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15269invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onError.invoke(((PlaidEvent.Error) eventPlaidComposable$lambda$03.getData()).getThrowable());
                        }
                    });
                }
                LoadingScreenComposablesKt.ShimmerLoadingComposable(ShimmerLoaderType.Boxes.INSTANCE, modifier3, composerStartRestartGroup, ((i3 >> 6) & 112) | ShimmerLoaderType.Boxes.$stable, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Event<PlaidEvent> PlaidComposable$lambda$0(SnapshotState4<Event<PlaidEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
