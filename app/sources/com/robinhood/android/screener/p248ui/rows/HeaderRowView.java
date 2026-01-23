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
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import com.robinhood.android.screener.p248ui.composables.HeaderRowComposable;
import com.robinhood.compose.app.GenericComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HeaderRowView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010!\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\r\u0010\"\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010#R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/screener/ui/rows/HeaderRowView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;", "header", "getHeader", "()Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;", "setHeader", "(Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerHeader;)V", "header$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "onClick", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "setOnClick", "(Lkotlin/jvm/functions/Function0;)V", "onClick$delegate", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure", "setDisclosure", "disclosure$delegate", "onAppear", "getOnAppear", "setOnAppear", "onAppear$delegate", "bind", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class HeaderRowView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;

    /* renamed from: disclosure$delegate, reason: from kotlin metadata */
    private final SnapshotState disclosure;

    /* renamed from: header$delegate, reason: from kotlin metadata */
    private final SnapshotState header;

    /* renamed from: onAppear$delegate, reason: from kotlin metadata */
    private final SnapshotState onAppear;

    /* renamed from: onClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onClick;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(HeaderRowView headerRowView, int i, Composer composer, int i2) throws Resources.NotFoundException {
        headerRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ HeaderRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.header = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.onClick = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.HeaderRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
        this.disclosure = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.HeaderRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
        this.onAppear = SnapshotState3.mutableStateOf$default(new Function0() { // from class: com.robinhood.android.screener.ui.rows.HeaderRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ScreenerRows.ScreenerHeader getHeader() {
        return (ScreenerRows.ScreenerHeader) this.header.getValue();
    }

    private final void setHeader(ScreenerRows.ScreenerHeader screenerHeader) {
        this.header.setValue(screenerHeader);
    }

    private final Function0<Unit> getOnClick() {
        return (Function0) this.onClick.getValue();
    }

    private final void setOnClick(Function0<Unit> function0) {
        this.onClick.setValue(function0);
    }

    private final Function0<Unit> getDisclosure() {
        return (Function0) this.disclosure.getValue();
    }

    private final void setDisclosure(Function0<Unit> function0) {
        this.disclosure.setValue(function0);
    }

    private final Function0<Unit> getOnAppear() {
        return (Function0) this.onAppear.getValue();
    }

    private final void setOnAppear(Function0<Unit> function0) {
        this.onAppear.setValue(function0);
    }

    public final void bind(ScreenerRows.ScreenerHeader header, Function0<Unit> onClick, Function0<Unit> disclosure, Function0<Unit> onAppear) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        setHeader(header);
        setOnClick(onClick);
        setDisclosure(disclosure);
        setOnAppear(onAppear);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-738284213);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-738284213, i2, -1, "com.robinhood.android.screener.ui.rows.HeaderRowView.Content (HeaderRowView.kt:35)");
            }
            ScreenerRows.ScreenerHeader header = getHeader();
            if (header != null) {
                String string2 = getResources().getString(header.getDisplayTitleRes());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = getResources().getString(header.getActionButtonTextRes());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                HeaderRowComposable.HeaderRowComposable(string2, string3, getOnClick(), getDisclosure(), getOnAppear(), composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.rows.HeaderRowView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeaderRowView.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
