package com.robinhood.shared.common.compose.multimodebottomsheet;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiModeSheetState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "", "<init>", "()V", MultiModeSheetState2.TYPE_HIDDEN, MultiModeSheetState2.TYPE_EXPANDED, MultiModeSheetState2.TYPE_FIXED_HEIGHT, "Companion", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$Expanded;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$FixedHeight;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$Hidden;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class MultiModeSheetState2 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<MultiModeSheetState2, List<Object>> Saver = Saver2.Saver(new Function2() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return MultiModeSheetState2.Saver$lambda$0((Saver5) obj, (MultiModeSheetState2) obj2);
        }
    }, new Function1() { // from class: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MultiModeSheetState2.Saver$lambda$1((List) obj);
        }
    });
    private static final String TYPE_EXPANDED = "Expanded";
    private static final String TYPE_FIXED_HEIGHT = "FixedHeight";
    private static final String TYPE_HIDDEN = "Hidden";

    public /* synthetic */ MultiModeSheetState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MultiModeSheetState2() {
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$Hidden;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$Hidden */
    public static final /* data */ class Hidden extends MultiModeSheetState2 {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return -581825259;
        }

        public String toString() {
            return MultiModeSheetState2.TYPE_HIDDEN;
        }

        private Hidden() {
            super(null);
        }
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$Expanded;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$Expanded */
    public static final /* data */ class Expanded extends MultiModeSheetState2 {
        public static final int $stable = 0;
        public static final Expanded INSTANCE = new Expanded();

        public boolean equals(Object other) {
            return this == other || (other instanceof Expanded);
        }

        public int hashCode() {
            return -953094812;
        }

        public String toString() {
            return MultiModeSheetState2.TYPE_EXPANDED;
        }

        private Expanded() {
            super(null);
        }
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$FixedHeight;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$FixedHeight, reason: from toString */
    public static final /* data */ class FixedHeight extends MultiModeSheetState2 {
        public static final int $stable = 0;
        private final int height;

        public static /* synthetic */ FixedHeight copy$default(FixedHeight fixedHeight, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fixedHeight.height;
            }
            return fixedHeight.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final FixedHeight copy(int height) {
            return new FixedHeight(height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FixedHeight) && this.height == ((FixedHeight) other).height;
        }

        public int hashCode() {
            return Integer.hashCode(this.height);
        }

        public String toString() {
            return "FixedHeight(height=" + this.height + ")";
        }

        public final int getHeight() {
            return this.height;
        }

        public FixedHeight(int i) {
            super(null);
            this.height = i;
        }
    }

    /* compiled from: MultiModeSheetState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue$Companion;", "", "<init>", "()V", "TYPE_HIDDEN", "", "TYPE_EXPANDED", "TYPE_FIXED_HEIGHT", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/shared/common/compose/multimodebottomsheet/MultiModeSheetValue;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "lib-compose-multi-mode-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.common.compose.multimodebottomsheet.MultiModeSheetValue$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<MultiModeSheetState2, List<Object>> getSaver() {
            return MultiModeSheetState2.Saver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Saver$lambda$0(Saver5 Saver2, MultiModeSheetState2 value) {
        Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof Hidden) {
            return CollectionsKt.listOf(TYPE_HIDDEN);
        }
        if (value instanceof Expanded) {
            return CollectionsKt.listOf(TYPE_EXPANDED);
        }
        if (value instanceof FixedHeight) {
            return CollectionsKt.listOf(TYPE_FIXED_HEIGHT, Integer.valueOf(((FixedHeight) value).getHeight()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultiModeSheetState2 Saver$lambda$1(List savedValue) {
        Intrinsics.checkNotNullParameter(savedValue, "savedValue");
        Object obj = savedValue.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        int iHashCode = str.hashCode();
        if (iHashCode != -2133620278) {
            if (iHashCode != -1893751397) {
                if (iHashCode == -1874456359 && str.equals(TYPE_EXPANDED)) {
                    return Expanded.INSTANCE;
                }
            } else if (str.equals(TYPE_FIXED_HEIGHT)) {
                Object obj2 = savedValue.get(1);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                return new FixedHeight(((Integer) obj2).intValue());
            }
        } else if (str.equals(TYPE_HIDDEN)) {
            return Hidden.INSTANCE;
        }
        return Hidden.INSTANCE;
    }
}
