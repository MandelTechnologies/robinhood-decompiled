package com.robinhood.android.shareholderexperience.eventslist;

import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.rows.EventRow;
import com.robinhood.compose.bento.component.rows.EventRowState;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Placeholder.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"ShareholderEventNavigationRowPlaceholder", "", "ActionT", "Landroid/os/Parcelable;", "components", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-shareholder-experience_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PlaceholderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareholderEventNavigationRowPlaceholder$lambda$0(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShareholderEventNavigationRowPlaceholder(list, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: Placeholder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.shareholderexperience.eventslist.PlaceholderKt$ShareholderEventNavigationRowPlaceholder$1 */
    static final class C284991 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<UIComponent<ActionT>> $components;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: Multi-variable type inference failed */
        C284991(List<? extends UIComponent<? extends ActionT>> list, Modifier modifier) {
            this.$components = list;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-954096572, i, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventNavigationRowPlaceholder.<anonymous> (Placeholder.kt:19)");
            }
            Iterable iterable = this.$components;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof ShareholderEventNavigationRow) {
                    arrayList.add(obj);
                }
            }
            Modifier modifier = this.$modifier;
            Iterable<UIComponent> iterable2 = this.$components;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(25373845);
            for (UIComponent uIComponent : iterable2) {
                Intrinsics.checkNotNull(uIComponent, "null cannot be cast to non-null type com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow<ActionT of com.robinhood.android.shareholderexperience.eventslist.PlaceholderKt.ShareholderEventNavigationRowPlaceholder>");
                ShareholderEventNavigationRow shareholderEventNavigationRow = (ShareholderEventNavigationRow) uIComponent;
                EventRowState eventRowState = new EventRowState(new EventRowState.Start.TwoLine(shareholderEventNavigationRow.getStart_component().getMonth(), shareholderEventNavigationRow.getStart_component().getDay(), null, null, 12, null), shareholderEventNavigationRow.getTitle(), shareholderEventNavigationRow.getSubtitle());
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.shareholderexperience.eventslist.PlaceholderKt$ShareholderEventNavigationRowPlaceholder$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EventRow.EventRow(eventRowState, (Function0) objRememberedValue, null, composer, EventRowState.$stable | 48, 4);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final <ActionT extends Parcelable> void ShareholderEventNavigationRowPlaceholder(final List<? extends UIComponent<? extends ActionT>> components, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(components, "components");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1642092588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1642092588, i3, -1, "com.robinhood.android.shareholderexperience.eventslist.ShareholderEventNavigationRowPlaceholder (Placeholder.kt:18)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-954096572, true, new C284991(components, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.shareholderexperience.eventslist.PlaceholderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaceholderKt.ShareholderEventNavigationRowPlaceholder$lambda$0(components, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
