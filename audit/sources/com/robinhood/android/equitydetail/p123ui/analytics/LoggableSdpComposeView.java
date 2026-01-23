package com.robinhood.android.equitydetail.p123ui.analytics;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggableSdpComposeView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u001d\u001a\u00020\u001eH'¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0004\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "Lcom/robinhood/compose/app/GenericComposeView;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/rosetta/eventlogging/Screen;", "screen", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "setScreen", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "screen$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/rosetta/eventlogging/Context;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "setContext", "(Lcom/robinhood/rosetta/eventlogging/Context;)V", "context$delegate", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "SdpContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Content", "lib-equity-detail-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class LoggableSdpComposeView extends GenericComposeView {
    public static final int $stable = 8;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final SnapshotState context;

    /* renamed from: screen$delegate, reason: from kotlin metadata */
    private final SnapshotState screen;
    private final ViewModelStoreOwner viewModelStoreOwner;

    public abstract void SdpContent(Composer composer, int i);

    public abstract Component getComponent();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggableSdpComposeView(ViewModelStoreOwner viewModelStoreOwner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.screen = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.context = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Screen getScreen() {
        return (Screen) this.screen.getValue();
    }

    public final void setScreen(Screen screen) {
        this.screen.setValue(screen);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final com.robinhood.rosetta.eventlogging.Context getContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.context.getValue();
    }

    public final void setContext(com.robinhood.rosetta.eventlogging.Context context) {
        this.context.setValue(context);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, int i) {
        composer.startReplaceGroup(817986423);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(817986423, i, -1, "com.robinhood.android.equitydetail.ui.analytics.LoggableSdpComposeView.Content (LoggableSdpComposeView.kt:37)");
        }
        CompositionLocal3.CompositionLocalProvider(LocalViewModelStoreOwner.INSTANCE.provides(this.viewModelStoreOwner), ComposableLambda3.rememberComposableLambda(-1961775049, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.analytics.LoggableSdpComposeView.Content.1
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
                    ComposerKt.traceEventStart(-1961775049, i2, -1, "com.robinhood.android.equitydetail.ui.analytics.LoggableSdpComposeView.Content.<anonymous> (LoggableSdpComposeView.kt:41)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, LoggableSdpComposeView.this.getScreen(), null, LoggableSdpComposeView.this.getContext(), LoggableSdpComposeView.this.getComponent(), null, 37, null);
                final LoggableSdpComposeView loggableSdpComposeView = LoggableSdpComposeView.this;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1601242078, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.analytics.LoggableSdpComposeView.Content.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1601242078, i3, -1, "com.robinhood.android.equitydetail.ui.analytics.LoggableSdpComposeView.Content.<anonymous>.<anonymous> (LoggableSdpComposeView.kt:48)");
                        }
                        float f = 1;
                        Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, true, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 12, null);
                        LoggableSdpComposeView loggableSdpComposeView2 = loggableSdpComposeView;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5173sizeInqDBjuR0$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        loggableSdpComposeView2.SdpContent(composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
