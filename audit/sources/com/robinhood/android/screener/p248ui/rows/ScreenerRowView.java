package com.robinhood.android.screener.p248ui.rows;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import com.robinhood.android.screener.p248ui.composables.ScreenerRowComposable8;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerRowView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\r\u0010\u001e\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u001fR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/screener/ui/rows/ScreenerRowView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "screenerRow", "getScreenerRow", "()Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "setScreenerRow", "(Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;)V", "screenerRow$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "onScreenerClicked", "getOnScreenerClicked", "()Lkotlin/jvm/functions/Function0;", "setOnScreenerClicked", "(Lkotlin/jvm/functions/Function0;)V", "onScreenerClicked$delegate", "onAppear", "getOnAppear", "setOnAppear", "onAppear$delegate", "bind", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ScreenerRowView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;

    /* renamed from: onAppear$delegate, reason: from kotlin metadata */
    private final SnapshotState onAppear;

    /* renamed from: onScreenerClicked$delegate, reason: from kotlin metadata */
    private final SnapshotState onScreenerClicked;

    /* renamed from: screenerRow$delegate, reason: from kotlin metadata */
    private final SnapshotState screenerRow;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(ScreenerRowView screenerRowView, int i, Composer composer, int i2) {
        screenerRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScreenerRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenerRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.screenerRow = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.onScreenerClicked = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ScreenerRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
        this.onAppear = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ScreenerRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ScreenerRows.ScreenerRow getScreenerRow() {
        return (ScreenerRows.ScreenerRow) this.screenerRow.getValue();
    }

    private final void setScreenerRow(ScreenerRows.ScreenerRow screenerRow) {
        this.screenerRow.setValue(screenerRow);
    }

    private final Function0<Unit> getOnScreenerClicked() {
        return (Function0) this.onScreenerClicked.getValue();
    }

    private final void setOnScreenerClicked(Function0<Unit> function0) {
        this.onScreenerClicked.setValue(function0);
    }

    private final Function0<Unit> getOnAppear() {
        return (Function0) this.onAppear.getValue();
    }

    private final void setOnAppear(Function0<Unit> function0) {
        this.onAppear.setValue(function0);
    }

    public final void bind(ScreenerRows.ScreenerRow screenerRow, Function0<Unit> onScreenerClicked, Function0<Unit> onAppear) {
        Intrinsics.checkNotNullParameter(screenerRow, "screenerRow");
        Intrinsics.checkNotNullParameter(onScreenerClicked, "onScreenerClicked");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        setScreenerRow(screenerRow);
        setOnScreenerClicked(onScreenerClicked);
        setOnAppear(onAppear);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-566734877);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566734877, i2, -1, "com.robinhood.android.screener.ui.rows.ScreenerRowView.Content (ScreenerRowView.kt:38)");
            }
            ScreenerRows.ScreenerRow screenerRow = getScreenerRow();
            if (screenerRow == null) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                ScreenerRowComposable8.ScreenerRowComposable(screenerRow.getDisplayName(), screenerRow.getSubtitleText(), screenerRow.getIconString(), screenerRow.isPreset(), getOnScreenerClicked(), getOnAppear(), false, composer2, 0, 64);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer2, 6, 1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                composer2.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.rows.ScreenerRowView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowView.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
