package com.robinhood.android.formentry.composables;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.formentry.FormEntryDuxo;
import com.robinhood.android.formentry.FormEntryViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;

/* compiled from: FormEntryPage.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"FormEntryPage", "", "duxo", "Lcom/robinhood/android/formentry/FormEntryDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "onStateChanged", "Lkotlin/Function0;", "(Lcom/robinhood/android/formentry/FormEntryDuxo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-form-entry_externalDebug", "state", "Lcom/robinhood/android/formentry/FormEntryViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.formentry.composables.FormEntryPageKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FormEntryPage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormEntryPage$lambda$3(FormEntryDuxo formEntryDuxo, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        FormEntryPage(formEntryDuxo, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FormEntryPage(final FormEntryDuxo duxo, Modifier modifier, final Function0<Unit> onStateChanged, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(517125721);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStateChanged) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517125721, i3, -1, "com.robinhood.android.formentry.composables.FormEntryPage (FormEntryPage.kt:16)");
            }
            FormEntryViewState formEntryViewStateFormEntryPage$lambda$0 = FormEntryPage$lambda$0(FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.formentry.composables.FormEntryPageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FormEntryPage.FormEntryPage$lambda$2$lambda$1(duxo, onStateChanged, (String) obj, (FormInputDto) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier3 = modifier;
            FormEntryPageInternal4.FormEntryPageInternal(formEntryViewStateFormEntryPage$lambda$0, (Function2) objRememberedValue, modifier3, composerStartRestartGroup, (i3 << 3) & 896, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.formentry.composables.FormEntryPageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormEntryPage.FormEntryPage$lambda$3(duxo, modifier2, onStateChanged, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormEntryPage$lambda$2$lambda$1(FormEntryDuxo formEntryDuxo, Function0 function0, String newValue, FormInputDto position) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(position, "position");
        formEntryDuxo.valueChangedForIndex(newValue, position);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final FormEntryViewState FormEntryPage$lambda$0(SnapshotState4<FormEntryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
