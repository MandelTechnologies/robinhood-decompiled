package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.store.linking.LinkingGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostState;", "", "accountNumber", "", "selectedGroupId", "groups", "", "Lcom/robinhood/android/store/linking/LinkingGroup;", "colors", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getSelectedGroupId", "getGroups", "()Ljava/util/List;", "getColors", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MobileLinkingHostState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<Color> colors;
    private final List<LinkingGroup> groups;
    private final String selectedGroupId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileLinkingHostState copy$default(MobileLinkingHostState mobileLinkingHostState, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mobileLinkingHostState.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = mobileLinkingHostState.selectedGroupId;
        }
        if ((i & 4) != 0) {
            list = mobileLinkingHostState.groups;
        }
        if ((i & 8) != 0) {
            list2 = mobileLinkingHostState.colors;
        }
        return mobileLinkingHostState.copy(str, str2, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedGroupId() {
        return this.selectedGroupId;
    }

    public final List<LinkingGroup> component3() {
        return this.groups;
    }

    public final List<Color> component4() {
        return this.colors;
    }

    public final MobileLinkingHostState copy(String accountNumber, String selectedGroupId, List<LinkingGroup> groups, List<Color> colors) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new MobileLinkingHostState(accountNumber, selectedGroupId, groups, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileLinkingHostState)) {
            return false;
        }
        MobileLinkingHostState mobileLinkingHostState = (MobileLinkingHostState) other;
        return Intrinsics.areEqual(this.accountNumber, mobileLinkingHostState.accountNumber) && Intrinsics.areEqual(this.selectedGroupId, mobileLinkingHostState.selectedGroupId) && Intrinsics.areEqual(this.groups, mobileLinkingHostState.groups) && Intrinsics.areEqual(this.colors, mobileLinkingHostState.colors);
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        String str = this.selectedGroupId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groups.hashCode()) * 31;
        List<Color> list = this.colors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "MobileLinkingHostState(accountNumber=" + this.accountNumber + ", selectedGroupId=" + this.selectedGroupId + ", groups=" + this.groups + ", colors=" + this.colors + ")";
    }

    public MobileLinkingHostState(String accountNumber, String str, List<LinkingGroup> groups, List<Color> list) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.accountNumber = accountNumber;
        this.selectedGroupId = str;
        this.groups = groups;
        this.colors = list;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSelectedGroupId() {
        return this.selectedGroupId;
    }

    public /* synthetic */ MobileLinkingHostState(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : list2);
    }

    public final List<LinkingGroup> getGroups() {
        return this.groups;
    }

    public final List<Color> getColors() {
        return this.colors;
    }
}
