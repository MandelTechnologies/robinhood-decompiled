package com.robinhood.android.equitydetail.p123ui.similarinstruments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equitydetail.p123ui.SimilarInstrumentsV2Data;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SimilarInstrumentsV2View.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015J\r\u0010 \u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010!R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/similarinstruments/SimilarInstrumentsV2View;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "<set-?>", "Lcom/robinhood/android/equitydetail/ui/SimilarInstrumentsV2Data;", "state", "getState", "()Lcom/robinhood/android/equitydetail/ui/SimilarInstrumentsV2Data;", "setState", "(Lcom/robinhood/android/equitydetail/ui/SimilarInstrumentsV2Data;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "bind", "", "similarInstrumentsV2Data", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SimilarInstrumentsV2View extends Hammer_SimilarInstrumentsV2View {
    public static final int $stable = 8;
    public Navigator navigator;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimilarInstrumentsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        this(context, viewModelStoreOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(SimilarInstrumentsV2View similarInstrumentsV2View, int i, Composer composer, int i2) {
        similarInstrumentsV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(SimilarInstrumentsV2View similarInstrumentsV2View, int i, Composer composer, int i2) {
        similarInstrumentsV2View.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ SimilarInstrumentsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimilarInstrumentsV2View(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
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

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.PEOPLE_ALSO_VIEW_SECTION, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SimilarInstrumentsV2Data getState() {
        return (SimilarInstrumentsV2Data) this.state.getValue();
    }

    private final void setState(SimilarInstrumentsV2Data similarInstrumentsV2Data) {
        this.state.setValue(similarInstrumentsV2Data);
    }

    public final void bind(SimilarInstrumentsV2Data similarInstrumentsV2Data) {
        Intrinsics.checkNotNullParameter(similarInstrumentsV2Data, "similarInstrumentsV2Data");
        setState(similarInstrumentsV2Data);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(247825989);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(247825989, i2, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View.SdpContent (SimilarInstrumentsV2View.kt:43)");
            }
            final SimilarInstrumentsV2Data state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SimilarInstrumentsV2View.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1645418480, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View.SdpContent.1
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
                        ComposerKt.traceEventStart(1645418480, i3, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View.SdpContent.<anonymous> (SimilarInstrumentsV2View.kt:52)");
                    }
                    ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(SimilarInstrumentsV2View.this.getNavigator());
                    final SimilarInstrumentsV2Data similarInstrumentsV2Data = state;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(2068794160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View.SdpContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) throws Resources.NotFoundException {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2068794160, i4, -1, "com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View.SdpContent.<anonymous>.<anonymous> (SimilarInstrumentsV2View.kt:55)");
                            }
                            SimilarInstrumentsV2Kt.SimilarInstrumentsV2(similarInstrumentsV2Data.getInstrumentUuid(), null, composer3, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.similarinstruments.SimilarInstrumentsV2View$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimilarInstrumentsV2View.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
