package com.robinhood.android.educationtour.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeEducationTourElementData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "", "offsetInRoot", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/unit/IntSize;", "onClick", "Lkotlin/Function0;", "", "onFocus", "<init>", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOffsetInRoot-F1C5BW0", "()J", "J", "getSize-YbymL2g", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnFocus", "component1", "component1-F1C5BW0", "component2", "component2-YbymL2g", "component3", "component4", "copy", "copy-veiH6h0", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ComposeEducationTourElementData {
    public static final int $stable = 0;
    private final long offsetInRoot;
    private final Function0<Unit> onClick;
    private final Function0<Unit> onFocus;
    private final long size;

    public /* synthetic */ ComposeEducationTourElementData(long j, long j2, Function0 function0, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, function0, function02);
    }

    /* renamed from: copy-veiH6h0$default, reason: not valid java name */
    public static /* synthetic */ ComposeEducationTourElementData m13462copyveiH6h0$default(ComposeEducationTourElementData composeEducationTourElementData, long j, long j2, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            j = composeEducationTourElementData.offsetInRoot;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = composeEducationTourElementData.size;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            function0 = composeEducationTourElementData.onClick;
        }
        Function0 function03 = function0;
        if ((i & 8) != 0) {
            function02 = composeEducationTourElementData.onFocus;
        }
        return composeEducationTourElementData.m13465copyveiH6h0(j3, j4, function03, function02);
    }

    /* renamed from: component1-F1C5BW0, reason: not valid java name and from getter */
    public final long getOffsetInRoot() {
        return this.offsetInRoot;
    }

    /* renamed from: component2-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final Function0<Unit> component3() {
        return this.onClick;
    }

    public final Function0<Unit> component4() {
        return this.onFocus;
    }

    /* renamed from: copy-veiH6h0, reason: not valid java name */
    public final ComposeEducationTourElementData m13465copyveiH6h0(long offsetInRoot, long size, Function0<Unit> onClick, Function0<Unit> onFocus) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        return new ComposeEducationTourElementData(offsetInRoot, size, onClick, onFocus, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeEducationTourElementData)) {
            return false;
        }
        ComposeEducationTourElementData composeEducationTourElementData = (ComposeEducationTourElementData) other;
        return Offset.m6540equalsimpl0(this.offsetInRoot, composeEducationTourElementData.offsetInRoot) && IntSize.m8058equalsimpl0(this.size, composeEducationTourElementData.size) && Intrinsics.areEqual(this.onClick, composeEducationTourElementData.onClick) && Intrinsics.areEqual(this.onFocus, composeEducationTourElementData.onFocus);
    }

    public int hashCode() {
        return (((((Offset.m6545hashCodeimpl(this.offsetInRoot) * 31) + IntSize.m8061hashCodeimpl(this.size)) * 31) + this.onClick.hashCode()) * 31) + this.onFocus.hashCode();
    }

    public String toString() {
        return "ComposeEducationTourElementData(offsetInRoot=" + Offset.m6549toStringimpl(this.offsetInRoot) + ", size=" + IntSize.m8062toStringimpl(this.size) + ", onClick=" + this.onClick + ", onFocus=" + this.onFocus + ")";
    }

    private ComposeEducationTourElementData(long j, long j2, Function0<Unit> onClick, Function0<Unit> onFocus) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        this.offsetInRoot = j;
        this.size = j2;
        this.onClick = onClick;
        this.onFocus = onFocus;
    }

    /* renamed from: getOffsetInRoot-F1C5BW0, reason: not valid java name */
    public final long m13466getOffsetInRootF1C5BW0() {
        return this.offsetInRoot;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m13467getSizeYbymL2g() {
        return this.size;
    }

    public /* synthetic */ ComposeEducationTourElementData(long j, long j2, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? new Function0() { // from class: com.robinhood.android.educationtour.compose.ComposeEducationTourElementData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i & 8) != 0 ? new Function0() { // from class: com.robinhood.android.educationtour.compose.ComposeEducationTourElementData$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function02, null);
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function0<Unit> getOnFocus() {
        return this.onFocus;
    }
}
