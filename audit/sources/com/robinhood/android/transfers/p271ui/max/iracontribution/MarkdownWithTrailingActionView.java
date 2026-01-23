package com.robinhood.android.transfers.p271ui.max.iracontribution;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler6;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiChunk2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: MarkdownWithTrailingActionView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010(\u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R`\u0010\u0017\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u001d¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f0\u0018j\b\u0012\u0004\u0012\u00020\u0004` X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010%\u001a\n '*\u0004\u0018\u00010&0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/MarkdownWithTrailingActionView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "bottomsheetPresenterFn", "Lkotlin/Function2;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lkotlin/ParameterName;", "name", "alert", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiCallbacks;", "callbacks", "", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/BottomSheetPresenterFn;", "getBottomsheetPresenterFn", "()Lkotlin/jvm/functions/Function2;", "setBottomsheetPresenterFn", "(Lkotlin/jvm/functions/Function2;)V", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "kotlin.jvm.PlatformType", "bind", "state", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MarkdownWithTrailingActionView extends Hammer_MarkdownWithTrailingActionView implements Bindable<MarkdownWithTrailingAction<? extends GenericAction>> {
    public static final int $stable = 8;
    private Function2<? super GenericAlertContent<? extends GenericAction>, ? super SduiActionHandler6<GenericAction>, Unit> bottomsheetPresenterFn;
    private final ComposeView composeView;
    public Markwon markwon;
    public Navigator navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownWithTrailingActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bottomsheetPresenterFn = new Function2() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.MarkdownWithTrailingActionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarkdownWithTrailingActionView.bottomsheetPresenterFn$lambda$0((GenericAlertContent) obj, (SduiActionHandler6) obj2);
            }
        };
        ViewGroups.inflate(this, C30065R.layout.merge_markdown_with_trailing_action, true);
        this.composeView = (ComposeView) findViewById(C30065R.id.markdown_with_trailing_action_compose_view);
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomsheetPresenterFn$lambda$0(GenericAlertContent genericAlertContent, SduiActionHandler6 sduiActionHandler6) {
        Intrinsics.checkNotNullParameter(genericAlertContent, "<unused var>");
        Intrinsics.checkNotNullParameter(sduiActionHandler6, "<unused var>");
        return Unit.INSTANCE;
    }

    public final Function2<GenericAlertContent<? extends GenericAction>, SduiActionHandler6<GenericAction>, Unit> getBottomsheetPresenterFn() {
        return this.bottomsheetPresenterFn;
    }

    public final void setBottomsheetPresenterFn(Function2<? super GenericAlertContent<? extends GenericAction>, ? super SduiActionHandler6<GenericAction>, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.bottomsheetPresenterFn = function2;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final MarkdownWithTrailingAction<? extends GenericAction> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.composeView.setContent(ComposableLambda3.composableLambdaInstance(-379347162, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.MarkdownWithTrailingActionView.bind.1
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
                    ComposerKt.traceEventStart(-379347162, i, -1, "com.robinhood.android.transfers.ui.max.iracontribution.MarkdownWithTrailingActionView.bind.<anonymous> (MarkdownWithTrailingActionView.kt:40)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(MarkdownWithTrailingActionView.this));
                final MarkdownWithTrailingAction<GenericAction> markdownWithTrailingAction = state;
                final MarkdownWithTrailingActionView markdownWithTrailingActionView = MarkdownWithTrailingActionView.this;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-466108968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.iracontribution.MarkdownWithTrailingActionView.bind.1.1
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
                            ComposerKt.traceEventStart(-466108968, i2, -1, "com.robinhood.android.transfers.ui.max.iracontribution.MarkdownWithTrailingActionView.bind.<anonymous>.<anonymous> (MarkdownWithTrailingActionView.kt:41)");
                        }
                        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(markdownWithTrailingAction);
                        SduiActionHandler2 sduiActionHandler2RememberDefaultSduiChunkCallbacks = SduiChunk2.rememberDefaultSduiChunkCallbacks(markdownWithTrailingActionView.getNavigator(), markdownWithTrailingActionView.getBottomsheetPresenterFn(), null, composer2, 0, 4);
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, sduiActionHandler2RememberDefaultSduiChunkCallbacks, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}
