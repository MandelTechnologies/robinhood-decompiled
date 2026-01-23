package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.models.serverdriven.experimental.api.AndEvaluator;
import com.robinhood.models.serverdriven.experimental.api.LogicEvaluator;
import com.robinhood.models.serverdriven.experimental.api.NotEvaluator;
import com.robinhood.models.serverdriven.experimental.api.OrEvaluator;
import com.robinhood.models.serverdriven.experimental.api.ReactiveComponent;
import com.robinhood.models.serverdriven.experimental.api.ReactiveComponentContent;
import com.robinhood.models.serverdriven.experimental.api.RefEvaluator;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiReactiveComponent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0011\u0010\t\u001a\u00020\n*\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SduiReactiveComponent", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/ReactiveComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ReactiveComponent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "evaluate", "", "Lcom/robinhood/models/serverdriven/experimental/api/LogicEvaluator;", "(Lcom/robinhood/models/serverdriven/experimental/api/LogicEvaluator;Landroidx/compose/runtime/Composer;I)Z", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiReactiveComponentKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiReactiveComponent2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiReactiveComponent$lambda$1(ReactiveComponent reactiveComponent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiReactiveComponent(reactiveComponent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiReactiveComponent(final ReactiveComponent<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Object next;
        UIComponent<ActionT> default_content;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(474819252);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
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
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(474819252, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiReactiveComponent (SduiReactiveComponent.kt:16)");
            }
            composerStartRestartGroup.startReplaceGroup(1034775259);
            Iterator<T> it = component.getStateful_content().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (evaluate(((ReactiveComponentContent) next).getEvaluator(), composerStartRestartGroup, 0)) {
                        break;
                    }
                }
            }
            ReactiveComponentContent reactiveComponentContent = (ReactiveComponentContent) next;
            composerStartRestartGroup.endReplaceGroup();
            if (reactiveComponentContent == null || (default_content = reactiveComponentContent.getContent()) == null) {
                default_content = component.getDefault_content();
            }
            SduiComponent3.SduiComponent(default_content, modifier2, null, composerStartRestartGroup, i3 & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiReactiveComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiReactiveComponent2.SduiReactiveComponent$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean evaluate(LogicEvaluator logicEvaluator, Composer composer, int i) {
        composer.startReplaceGroup(2095357148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2095357148, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.evaluate (SduiReactiveComponent.kt:27)");
        }
        if (logicEvaluator instanceof AndEvaluator) {
            composer.startReplaceGroup(-269770906);
            AndEvaluator andEvaluator = (AndEvaluator) logicEvaluator;
            zValidate = evaluate(andEvaluator.getLhs(), composer, 0) && evaluate(andEvaluator.getRhs(), composer, 0);
            composer.endReplaceGroup();
        } else if (logicEvaluator instanceof OrEvaluator) {
            composer.startReplaceGroup(-269712378);
            OrEvaluator orEvaluator = (OrEvaluator) logicEvaluator;
            if (!evaluate(orEvaluator.getLhs(), composer, 0) && !evaluate(orEvaluator.getRhs(), composer, 0)) {
                zValidate = false;
            }
            composer.endReplaceGroup();
        } else if (logicEvaluator instanceof NotEvaluator) {
            composer.startReplaceGroup(-701435155);
            zValidate = true ^ evaluate(((NotEvaluator) logicEvaluator).getValue(), composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(logicEvaluator instanceof RefEvaluator)) {
                composer.startReplaceGroup(-701440023);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-701432868);
            RefEvaluator refEvaluator = (RefEvaluator) logicEvaluator;
            zValidate = ((SduiStateHandler3) composer.consume(SduiStateHandler2.getLocalStateHandler())).validate(refEvaluator.getComponent_id(), refEvaluator.getState_id());
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return zValidate;
    }
}
