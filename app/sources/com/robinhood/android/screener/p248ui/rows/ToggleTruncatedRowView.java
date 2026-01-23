package com.robinhood.android.screener.p248ui.rows;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import com.robinhood.android.screener.p248ui.composables.ToggleTruncatedComposable;
import com.robinhood.compose.app.GenericComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ToggleTruncatedRowView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190'2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00190'J\r\u0010(\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010)R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/rows/ToggleTruncatedRowView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "", "textResId", "getTextResId", "()Ljava/lang/Integer;", "setTextResId", "(Ljava/lang/Integer;)V", "textResId$delegate", "Landroidx/compose/runtime/MutableState;", "", "truncated", "getTruncated", "()Ljava/lang/Boolean;", "setTruncated", "(Ljava/lang/Boolean;)V", "truncated$delegate", "Lkotlin/Function0;", "", "onClick", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick$delegate", "onAppear", "getOnAppear", "setOnAppear", "onAppear$delegate", "bind", "showMoreRow", "Lcom/robinhood/android/screener/ui/ScreenerRows$ToggleTruncatedRow;", "Lkotlin/Function1;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ToggleTruncatedRowView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;

    /* renamed from: onAppear$delegate, reason: from kotlin metadata */
    private final SnapshotState onAppear;

    /* renamed from: onClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onClick;

    /* renamed from: textResId$delegate, reason: from kotlin metadata */
    private final SnapshotState textResId;

    /* renamed from: truncated$delegate, reason: from kotlin metadata */
    private final SnapshotState truncated;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(ToggleTruncatedRowView toggleTruncatedRowView, int i, Composer composer, int i2) throws Resources.NotFoundException {
        toggleTruncatedRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$5(ToggleTruncatedRowView toggleTruncatedRowView, int i, Composer composer, int i2) throws Resources.NotFoundException {
        toggleTruncatedRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$6(ToggleTruncatedRowView toggleTruncatedRowView, int i, Composer composer, int i2) throws Resources.NotFoundException {
        toggleTruncatedRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToggleTruncatedRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleTruncatedRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textResId = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.truncated = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.onClick = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
        this.onAppear = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Integer getTextResId() {
        return (Integer) this.textResId.getValue();
    }

    private final void setTextResId(Integer num) {
        this.textResId.setValue(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Boolean getTruncated() {
        return (Boolean) this.truncated.getValue();
    }

    private final void setTruncated(Boolean bool) {
        this.truncated.setValue(bool);
    }

    private final Function0<Unit> getOnClick() {
        return (Function0) this.onClick.getValue();
    }

    private final void setOnClick(Function0<Unit> function0) {
        this.onClick.setValue(function0);
    }

    private final Function0<Unit> getOnAppear() {
        return (Function0) this.onAppear.getValue();
    }

    private final void setOnAppear(Function0<Unit> function0) {
        this.onAppear.setValue(function0);
    }

    public final void bind(final ScreenerRows.ToggleTruncatedRow showMoreRow, final Function1<? super Boolean, Unit> onClick, final Function1<? super Boolean, Unit> onAppear) {
        Intrinsics.checkNotNullParameter(showMoreRow, "showMoreRow");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        setTruncated(Boolean.valueOf(showMoreRow.getTruncated()));
        setTextResId(Integer.valueOf(showMoreRow.getDisplayTitleRes()));
        setOnClick(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ToggleTruncatedRowView.bind$lambda$2(onClick, showMoreRow);
            }
        });
        setOnAppear(new Function0() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ToggleTruncatedRowView.bind$lambda$3(onAppear, showMoreRow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(Function1 function1, ScreenerRows.ToggleTruncatedRow toggleTruncatedRow) {
        function1.invoke(Boolean.valueOf(!toggleTruncatedRow.getTruncated()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(Function1 function1, ScreenerRows.ToggleTruncatedRow toggleTruncatedRow) {
        function1.invoke(Boolean.valueOf(toggleTruncatedRow.getTruncated()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1390007303);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390007303, i2, -1, "com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView.Content (ToggleTruncatedRowView.kt:33)");
            }
            Boolean truncated = getTruncated();
            if (truncated == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ToggleTruncatedRowView.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            boolean zBooleanValue = truncated.booleanValue();
            Integer textResId = getTextResId();
            if (textResId == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ToggleTruncatedRowView.Content$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            String string2 = getResources().getString(textResId.intValue());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToggleTruncatedComposable.ToggleTruncatedComposable(string2, zBooleanValue, getOnClick(), getOnAppear(), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.rows.ToggleTruncatedRowView$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleTruncatedRowView.Content$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
