package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.common.ValueProp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackInstantAccessViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState;", "", "title", "", "bullets", "", "Lcom/robinhood/android/cash/flat/cashback/ui/common/ValueProp;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getBullets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FlatCashbackInstantAccessViewState {
    private static final FlatCashbackInstantAccessViewState mock;
    private final List<ValueProp> bullets;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlatCashbackInstantAccessViewState copy$default(FlatCashbackInstantAccessViewState flatCashbackInstantAccessViewState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flatCashbackInstantAccessViewState.title;
        }
        if ((i & 2) != 0) {
            list = flatCashbackInstantAccessViewState.bullets;
        }
        return flatCashbackInstantAccessViewState.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ValueProp> component2() {
        return this.bullets;
    }

    public final FlatCashbackInstantAccessViewState copy(String title, List<ValueProp> bullets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        return new FlatCashbackInstantAccessViewState(title, bullets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlatCashbackInstantAccessViewState)) {
            return false;
        }
        FlatCashbackInstantAccessViewState flatCashbackInstantAccessViewState = (FlatCashbackInstantAccessViewState) other;
        return Intrinsics.areEqual(this.title, flatCashbackInstantAccessViewState.title) && Intrinsics.areEqual(this.bullets, flatCashbackInstantAccessViewState.bullets);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.bullets.hashCode();
    }

    public String toString() {
        return "FlatCashbackInstantAccessViewState(title=" + this.title + ", bullets=" + this.bullets + ")";
    }

    public FlatCashbackInstantAccessViewState(String title, List<ValueProp> bullets) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bullets, "bullets");
        this.title = title;
        this.bullets = bullets;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ValueProp> getBullets() {
        return this.bullets;
    }

    /* compiled from: FlatCashbackInstantAccessViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState$Companion;", "", "<init>", "()V", "mock", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState;", "getMock$feature_cash_flat_cashback_externalDebug", "()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackInstantAccessViewState;", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FlatCashbackInstantAccessViewState getMock$feature_cash_flat_cashback_externalDebug() {
            return FlatCashbackInstantAccessViewState.mock;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(new ValueProp("---- ---- ---- ----- -----", "- --- -------- ---- --------- ----- ------ -- --- --- ------ ---- ---- ---"));
        }
        mock = new FlatCashbackInstantAccessViewState("------ --- ------- -- ---- ---- -- --- --- ----------", arrayList);
    }
}
