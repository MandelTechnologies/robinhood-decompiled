package com.robinhood.android.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.position.DisplayPositionListItem;
import com.robinhood.android.common.portfolio.position.PositionListItemComposableKt;
import com.robinhood.android.common.portfolio.position.SwipeAnimationPreview;
import com.robinhood.android.common.views.PositionListItemView;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionListItemView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u001eJ\r\u0010(\u001a\u00020&H\u0017¢\u0006\u0002\u0010)R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/views/PositionListItemView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "positionItem", "getPositionItem$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;", "setPositionItem$feature_lib_instrument_row_externalDebug", "(Lcom/robinhood/android/common/portfolio/position/DisplayPositionListItem;)V", "positionItem$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "swipeAnimationPreview", "getSwipeAnimationPreview", "()Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;", "setSwipeAnimationPreview", "(Lcom/robinhood/android/common/portfolio/position/SwipeAnimationPreview;)V", "swipeAnimationPreview$delegate", "Lcom/robinhood/android/common/views/PositionListItemView$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/android/common/views/PositionListItemView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/views/PositionListItemView$Callbacks;)V", "callbacks$delegate", "setData", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Content", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PositionListItemView extends Hammer_PositionListItemView {
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final SnapshotState callbacks;
    public Navigator navigator;

    /* renamed from: positionItem$delegate, reason: from kotlin metadata */
    private final SnapshotState positionItem;

    /* renamed from: swipeAnimationPreview$delegate, reason: from kotlin metadata */
    private final SnapshotState swipeAnimationPreview;

    /* compiled from: PositionListItemView.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/views/PositionListItemView$Callbacks;", "", "onClicked", "", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "onDisplayValueClicked", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "displayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "view", "Landroid/view/View;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClicked(PositionsV2.PositionListItemV2 position);

        void onDisplayValueClicked(PositionInstrumentType instrumentType, String displayType, View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(PositionListItemView positionListItemView, int i, Composer composer, int i2) {
        positionListItemView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(PositionListItemView positionListItemView, int i, Composer composer, int i2) {
        positionListItemView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ PositionListItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.positionItem = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.swipeAnimationPreview = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.callbacks = SnapshotState3.mutableStateOf$default(null, null, 2, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final DisplayPositionListItem getPositionItem$feature_lib_instrument_row_externalDebug() {
        return (DisplayPositionListItem) this.positionItem.getValue();
    }

    public final void setPositionItem$feature_lib_instrument_row_externalDebug(DisplayPositionListItem displayPositionListItem) {
        this.positionItem.setValue(displayPositionListItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final SwipeAnimationPreview getSwipeAnimationPreview() {
        return (SwipeAnimationPreview) this.swipeAnimationPreview.getValue();
    }

    private final void setSwipeAnimationPreview(SwipeAnimationPreview swipeAnimationPreview) {
        this.swipeAnimationPreview.setValue(swipeAnimationPreview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue();
    }

    private final void setCallbacks(Callbacks callbacks) {
        this.callbacks.setValue(callbacks);
    }

    public final void setData(DisplayPositionListItem item, SwipeAnimationPreview swipeAnimationPreview, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setPositionItem$feature_lib_instrument_row_externalDebug(item);
        setSwipeAnimationPreview(swipeAnimationPreview);
        setCallbacks(callbacks);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-272469990);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-272469990, i2, -1, "com.robinhood.android.common.views.PositionListItemView.Content (PositionListItemView.kt:63)");
            }
            final DisplayPositionListItem positionItem$feature_lib_instrument_row_externalDebug = getPositionItem$feature_lib_instrument_row_externalDebug();
            if (positionItem$feature_lib_instrument_row_externalDebug == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.views.PositionListItemView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PositionListItemView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final PositionsV2.PositionListItemV2 position = positionItem$feature_lib_instrument_row_externalDebug.getPosition();
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(998712154, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.PositionListItemView.Content.1
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
                        ComposerKt.traceEventStart(998712154, i3, -1, "com.robinhood.android.common.views.PositionListItemView.Content.<anonymous> (PositionListItemView.kt:70)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(PositionListItemView.this));
                    ThemesFromScarlet themesFromScarletThemesForCompose = ScarletComposeInterop.themesForCompose(ScarletManager2.getScarletManager(PositionListItemView.this));
                    final PositionsV2.PositionListItemV2 positionListItemV2 = position;
                    final DisplayPositionListItem displayPositionListItem = positionItem$feature_lib_instrument_row_externalDebug;
                    final PositionListItemView positionListItemView = PositionListItemView.this;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, themesFromScarletThemesForCompose, ComposableLambda3.rememberComposableLambda(-681641368, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.PositionListItemView.Content.1.1
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
                                ComposerKt.traceEventStart(-681641368, i4, -1, "com.robinhood.android.common.views.PositionListItemView.Content.<anonymous>.<anonymous> (PositionListItemView.kt:74)");
                            }
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1999858787, true, new C496981(positionListItemV2, displayPositionListItem, positionListItemView), composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: PositionListItemView.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.common.views.PositionListItemView$Content$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C496981 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ PositionsV2.PositionListItemV2 $position;
                            final /* synthetic */ DisplayPositionListItem $positionItem;
                            final /* synthetic */ PositionListItemView this$0;

                            C496981(PositionsV2.PositionListItemV2 positionListItemV2, DisplayPositionListItem displayPositionListItem, PositionListItemView positionListItemView) {
                                this.$position = positionListItemV2;
                                this.$positionItem = displayPositionListItem;
                                this.this$0 = positionListItemView;
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
                                    ComposerKt.traceEventStart(-1999858787, i, -1, "com.robinhood.android.common.views.PositionListItemView.Content.<anonymous>.<anonymous>.<anonymous> (PositionListItemView.kt:79)");
                                }
                                PositionsV2.PositionListItemV2 positionListItemV2 = this.$position;
                                String activeDisplayType = this.$positionItem.getActiveDisplayType();
                                PositionsLocation positionsLocation = PositionsLocation.HOME_TAB;
                                int index = this.$positionItem.getIndex();
                                SwipeAnimationPreview swipeAnimationPreview = this.this$0.getSwipeAnimationPreview();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$positionItem);
                                final PositionListItemView positionListItemView = this.this$0;
                                final DisplayPositionListItem displayPositionListItem = this.$positionItem;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.views.PositionListItemView$Content$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PositionListItemView.C119051.AnonymousClass1.C496981.invoke$lambda$1$lambda$0(positionListItemView, displayPositionListItem);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$position) | composer.changedInstance(this.$positionItem);
                                final PositionListItemView positionListItemView2 = this.this$0;
                                final PositionsV2.PositionListItemV2 positionListItemV22 = this.$position;
                                final DisplayPositionListItem displayPositionListItem2 = this.$positionItem;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.views.PositionListItemView$Content$1$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PositionListItemView.C119051.AnonymousClass1.C496981.invoke$lambda$3$lambda$2(positionListItemView2, positionListItemV22, displayPositionListItem2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                PositionListItemComposableKt.PositionListItemComposable(positionListItemV2, activeDisplayType, positionsLocation, index, null, null, null, swipeAnimationPreview, function0, (Function0) objRememberedValue2, composer, (SwipeAnimationPreview.$stable << 21) | 384, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(PositionListItemView positionListItemView, DisplayPositionListItem displayPositionListItem) {
                                Callbacks callbacks = positionListItemView.getCallbacks();
                                if (callbacks != null) {
                                    callbacks.onClicked(displayPositionListItem.getPosition());
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(PositionListItemView positionListItemView, PositionsV2.PositionListItemV2 positionListItemV2, DisplayPositionListItem displayPositionListItem) {
                                Callbacks callbacks = positionListItemView.getCallbacks();
                                if (callbacks != null) {
                                    callbacks.onDisplayValueClicked(positionListItemV2.getInstrumentType(), displayPositionListItem.getActiveDisplayType(), positionListItemView);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.views.PositionListItemView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionListItemView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
