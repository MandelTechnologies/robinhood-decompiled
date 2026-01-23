package com.robinhood.android.equitydetail.p123ui.history;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnifiedHistoryViewV2.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u00015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u00101\u001a\u0002022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#2\u0006\u0010+\u001a\u00020*J\r\u00103\u001a\u000202H\u0017¢\u0006\u0002\u00104R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u001a\u001a\u0004\u0018\u00010*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "callbacks", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;)V", "<set-?>", "Ljava/util/UUID;", "instrumentId", "getInstrumentId", "()Ljava/util/UUID;", "setInstrumentId", "(Ljava/util/UUID;)V", "instrumentId$delegate", "Landroidx/compose/runtime/MutableState;", "", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "accountNumber$delegate", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;", "historyType", "getHistoryType", "()Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;", "setHistoryType", "(Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;)V", "historyType$delegate", "bind", "", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UnifiedHistoryViewV2 extends Hammer_UnifiedHistoryViewV2 {
    public static final int $stable = 8;

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final SnapshotState accountNumber;
    private Callbacks callbacks;

    /* renamed from: historyType$delegate, reason: from kotlin metadata */
    private final SnapshotState historyType;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final SnapshotState instrumentId;
    public Navigator navigator;

    /* compiled from: UnifiedHistoryViewV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewV2$Callbacks;", "", "onRecentHistoryShowAllClicked", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRecentHistoryShowAllClicked();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UnifiedHistoryViewV2(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(UnifiedHistoryViewV2 unifiedHistoryViewV2, int i, Composer composer, int i2) {
        unifiedHistoryViewV2.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ UnifiedHistoryViewV2(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UnifiedHistoryViewV2(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.instrumentId = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.accountNumber = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.historyType = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        Component.ComponentType componentType;
        if (getId() == C15314R.id.instrument_detail_upcoming_activity) {
            componentType = Component.ComponentType.UPCOMING_ACTIVITY_SECTION;
        } else {
            componentType = Component.ComponentType.HISTORY_SECTION;
        }
        return new Component(componentType, null, null, 6, null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    private final void setInstrumentId(UUID uuid) {
        this.instrumentId.setValue(uuid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final void setAccountNumber(String str) {
        this.accountNumber.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final UnifiedHistoryType getHistoryType() {
        return (UnifiedHistoryType) this.historyType.getValue();
    }

    private final void setHistoryType(UnifiedHistoryType unifiedHistoryType) {
        this.historyType.setValue(unifiedHistoryType);
    }

    public final void bind(UUID instrumentId, String accountNumber, UnifiedHistoryType historyType) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(historyType, "historyType");
        setInstrumentId(instrumentId);
        setAccountNumber(accountNumber);
        setHistoryType(historyType);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-102433046);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102433046, i2, -1, "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2.SdpContent (UnifiedHistoryViewV2.kt:65)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(1087308330, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2.SdpContent.1
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
                        ComposerKt.traceEventStart(1087308330, i3, -1, "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2.SdpContent.<anonymous> (UnifiedHistoryViewV2.kt:69)");
                    }
                    UUID instrumentId = UnifiedHistoryViewV2.this.getInstrumentId();
                    if (instrumentId == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    String accountNumber = UnifiedHistoryViewV2.this.getAccountNumber();
                    if (accountNumber == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    UnifiedHistoryType historyType = UnifiedHistoryViewV2.this.getHistoryType();
                    if (historyType == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        UnifiedHistoryViewComposable.UnifiedHistoryViewComposable(instrumentId, accountNumber, historyType, UnifiedHistoryViewV2.this.getCallbacks(), null, null, composer2, 0, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryViewV2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedHistoryViewV2.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
