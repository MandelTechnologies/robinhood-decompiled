package com.robinhood.android.educationtour.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.educationtour.compose.ModifiersKt$educationTourId$3$1$1", m3645f = "Modifiers.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ModifiersKt$educationTourId$3$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $elementId;
    final /* synthetic */ SnapshotState<Offset> $offsetInRoot$delegate;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onFocus;
    final /* synthetic */ List<ComposeEducationTourScreen> $screens;
    final /* synthetic */ SnapshotState<IntSize> $size$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifiersKt$educationTourId$3$1$1(List<ComposeEducationTourScreen> list, String str, Function0<Unit> function0, Function0<Unit> function02, SnapshotState<Offset> snapshotState, SnapshotState<IntSize> snapshotState2, Continuation<? super ModifiersKt$educationTourId$3$1$1> continuation) {
        super(2, continuation);
        this.$screens = list;
        this.$elementId = str;
        this.$onClick = function0;
        this.$onFocus = function02;
        this.$offsetInRoot$delegate = snapshotState;
        this.$size$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifiersKt$educationTourId$3$1$1(this.$screens, this.$elementId, this.$onClick, this.$onFocus, this.$offsetInRoot$delegate, this.$size$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifiersKt$educationTourId$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<ComposeEducationTourScreen> list = this.$screens;
        String str = this.$elementId;
        Function0<Unit> function0 = this.$onClick;
        Function0<Unit> function02 = this.$onFocus;
        SnapshotState<Offset> snapshotState = this.$offsetInRoot$delegate;
        SnapshotState<IntSize> snapshotState2 = this.$size$delegate;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ComposeEducationTourManager.INSTANCE.setElementData$lib_education_tour_externalDebug(((ComposeEducationTourScreen) it.next()).getScreenName(), str, new ComposeEducationTourElementData(ModifiersKt.C144723.invoke$lambda$1(snapshotState), ModifiersKt.C144723.invoke$lambda$4(snapshotState2), function0, function02, null));
        }
        return Unit.INSTANCE;
    }
}
