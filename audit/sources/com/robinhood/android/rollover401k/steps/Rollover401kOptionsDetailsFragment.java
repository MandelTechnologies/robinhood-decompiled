package com.robinhood.android.rollover401k.steps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.models.retirement.p194db.Retirement401kRolloverViewModel;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.rollover401k.Rollover401kContent;
import com.robinhood.android.rollover401k.Rollover401kGenericFragment;
import com.robinhood.models.serverdriven.experimental.api.RetirementRollover401KOptionDetailOpenAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kOptionsDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kOptionsDetailsFragment;", "Lcom/robinhood/android/rollover401k/Rollover401kGenericFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getContentData", "Lcom/robinhood/android/rollover401k/Rollover401kContent;", "viewModels", "Lcom/robinhood/android/models/retirement/db/Retirement401kRolloverViewModel$RolloverViewModels;", "Rollover401kOptionsDetailsKey", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kOptionsDetailsFragment extends Rollover401kGenericFragment {
    private final Screen eventScreen = new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.rollover401k.Rollover401kGenericFragment
    public Rollover401kContent getContentData(Retirement401kRolloverViewModel.RolloverViewModels viewModels) {
        Companion companion = INSTANCE;
        List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> content = ((Rollover401kOptionsDetailsKey) companion.getArgs((Fragment) this)).getContent();
        List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> footer = ((Rollover401kOptionsDetailsKey) companion.getArgs((Fragment) this)).getFooter();
        if (footer == null) {
            footer = CollectionsKt.emptyList();
        }
        return new Rollover401kContent(null, content, footer);
    }

    /* compiled from: Rollover401kOptionsDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kOptionsDetailsFragment$Rollover401kOptionsDetailsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementRollover401KOptionDetailOpenAction;", Footer.f10637type, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getFooter", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Rollover401kOptionsDetailsKey implements FragmentKey {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Rollover401kOptionsDetailsKey> CREATOR = new Creator();
        private final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> content;
        private final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> footer;

        /* compiled from: Rollover401kOptionsDetailsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Rollover401kOptionsDetailsKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rollover401kOptionsDetailsKey createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(Rollover401kOptionsDetailsKey.class.getClassLoader()));
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList3.add(parcel.readParcelable(Rollover401kOptionsDetailsKey.class.getClassLoader()));
                    }
                    arrayList = arrayList3;
                }
                return new Rollover401kOptionsDetailsKey(arrayList2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rollover401kOptionsDetailsKey[] newArray(int i) {
                return new Rollover401kOptionsDetailsKey[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rollover401kOptionsDetailsKey copy$default(Rollover401kOptionsDetailsKey rollover401kOptionsDetailsKey, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rollover401kOptionsDetailsKey.content;
            }
            if ((i & 2) != 0) {
                list2 = rollover401kOptionsDetailsKey.footer;
            }
            return rollover401kOptionsDetailsKey.copy(list, list2);
        }

        public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> component1() {
            return this.content;
        }

        public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> component2() {
            return this.footer;
        }

        public final Rollover401kOptionsDetailsKey copy(List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> content, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> footer) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Rollover401kOptionsDetailsKey(content, footer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rollover401kOptionsDetailsKey)) {
                return false;
            }
            Rollover401kOptionsDetailsKey rollover401kOptionsDetailsKey = (Rollover401kOptionsDetailsKey) other;
            return Intrinsics.areEqual(this.content, rollover401kOptionsDetailsKey.content) && Intrinsics.areEqual(this.footer, rollover401kOptionsDetailsKey.footer);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> list = this.footer;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Rollover401kOptionsDetailsKey(content=" + this.content + ", footer=" + this.footer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> list = this.content;
            dest.writeInt(list.size());
            Iterator<UIComponent<RetirementRollover401KOptionDetailOpenAction>> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> list2 = this.footer;
            if (list2 == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<UIComponent<RetirementRollover401KOptionDetailOpenAction>> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Rollover401kOptionsDetailsKey(List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> content, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> list) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.footer = list;
        }

        public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> getContent() {
            return this.content;
        }

        public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> getFooter() {
            return this.footer;
        }
    }

    /* compiled from: Rollover401kOptionsDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/Rollover401kOptionsDetailsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kOptionsDetailsFragment;", "Lcom/robinhood/android/rollover401k/steps/Rollover401kOptionsDetailsFragment$Rollover401kOptionsDetailsKey;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<Rollover401kOptionsDetailsFragment, Rollover401kOptionsDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(Rollover401kOptionsDetailsKey rollover401kOptionsDetailsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rollover401kOptionsDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Rollover401kOptionsDetailsKey getArgs(Rollover401kOptionsDetailsFragment rollover401kOptionsDetailsFragment) {
            return (Rollover401kOptionsDetailsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rollover401kOptionsDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Rollover401kOptionsDetailsFragment newInstance(Rollover401kOptionsDetailsKey rollover401kOptionsDetailsKey) {
            return (Rollover401kOptionsDetailsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rollover401kOptionsDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Rollover401kOptionsDetailsFragment rollover401kOptionsDetailsFragment, Rollover401kOptionsDetailsKey rollover401kOptionsDetailsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rollover401kOptionsDetailsFragment, rollover401kOptionsDetailsKey);
        }
    }
}
