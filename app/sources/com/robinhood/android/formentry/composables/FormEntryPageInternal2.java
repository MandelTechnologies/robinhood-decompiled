package com.robinhood.android.formentry.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.formentry.FormEntryViewState;
import com.robinhood.android.formentry.data.FormEntryMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;

/* compiled from: FormEntryPageInternal.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt$lambda$-538049252$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FormEntryPageInternal2 implements Function2<Composer, Integer, Unit> {
    public static final FormEntryPageInternal2 INSTANCE = new FormEntryPageInternal2();

    FormEntryPageInternal2() {
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
            ComposerKt.traceEventStart(-538049252, i, -1, "com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt.lambda$-538049252.<anonymous> (FormEntryPageInternal.kt:26)");
        }
        FormEntryViewState formEntryViewState = new FormEntryViewState(extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new FormInputDto[]{new FormInputDto("Header", "Placeholder", "", "", null, 16, null), new FormInputDto("Header", null, "", "Value", null, 18, null), new FormInputDto("Header", "Placeholder", "", "Value", null, 16, null)})), extensions2.persistentListOf(), FormEntryMode.REVIEW);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.formentry.composables.ComposableSingletons$FormEntryPageInternalKt$lambda$-538049252$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FormEntryPageInternal2.invoke$lambda$1$lambda$0((String) obj, (FormInputDto) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        FormEntryPageInternal4.FormEntryPageInternal(formEntryViewState, (Function2) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String str, FormInputDto formInputDto) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(formInputDto, "<unused var>");
        return Unit.INSTANCE;
    }
}
