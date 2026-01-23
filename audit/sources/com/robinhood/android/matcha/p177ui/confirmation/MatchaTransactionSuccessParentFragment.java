package com.robinhood.android.matcha.p177ui.confirmation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.additionalpages.MatchaAdditionalPagesFragment;
import com.robinhood.android.matcha.p177ui.confirmation.MatchaTransactionSuccessFragment;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransactionSuccessParentFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDoneClicked", "postPageKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Args", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransactionSuccessParentFragment extends BaseFragment implements MatchaTransactionSuccessFragment.Callbacks, MatchaAdditionalPagesFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public MatchaTransactionSuccessParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            MatchaTransactionSuccessFragment.Companion companion = MatchaTransactionSuccessFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new MatchaTransactionSuccessFragment.Args(((Args) companion2.getArgs((Fragment) this)).getType(), ((Args) companion2.getArgs((Fragment) this)).getDirection(), ((Args) companion2.getArgs((Fragment) this)).getTransactors(), ((Args) companion2.getArgs((Fragment) this)).getEntryPoint())));
        }
    }

    @Override // com.robinhood.android.matcha.ui.confirmation.MatchaTransactionSuccessFragment.Callbacks, com.robinhood.android.matcha.ui.additionalpages.MatchaAdditionalPagesFragment.Callbacks
    public void onDoneClicked(FragmentKey postPageKey) {
        if (postPageKey == null) {
            requireBaseActivity().finish();
        } else {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), postPageKey, null, 2, null));
        }
    }

    /* compiled from: MatchaTransactionSuccessParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessParentFragment$Args;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;Lcom/robinhood/android/matcha/ui/models/Direction;Ljava/util/List;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getType", "()Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getTransactors", "()Ljava/util/List;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Direction direction;
        private final MatchaTransaction.EntryPoint entryPoint;
        private final List<Transactor> transactors;
        private final ConfirmationType type;

        /* compiled from: MatchaTransactionSuccessParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ConfirmationType confirmationType = (ConfirmationType) parcel.readParcelable(Args.class.getClassLoader());
                ArrayList arrayList = null;
                Direction directionCreateFromParcel = parcel.readInt() == 0 ? null : Direction.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(parcel.readParcelable(Args.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Args(confirmationType, directionCreateFromParcel, arrayList, MatchaTransaction.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.type, flags);
            Direction direction = this.direction;
            if (direction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                direction.writeToParcel(dest, flags);
            }
            List<Transactor> list = this.transactors;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<Transactor> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeString(this.entryPoint.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(ConfirmationType type2, Direction direction, List<? extends Transactor> list, MatchaTransaction.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.type = type2;
            this.direction = direction;
            this.transactors = list;
            this.entryPoint = entryPoint;
        }

        public /* synthetic */ Args(ConfirmationType confirmationType, Direction direction, List list, MatchaTransaction.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(confirmationType, (i & 2) != 0 ? null : direction, (i & 4) != 0 ? null : list, entryPoint);
        }

        public final ConfirmationType getType() {
            return this.type;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final List<Transactor> getTransactors() {
            return this.transactors;
        }

        public final MatchaTransaction.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaTransactionSuccessParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessParentFragment;", "Lcom/robinhood/android/matcha/ui/confirmation/MatchaTransactionSuccessParentFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaTransactionSuccessParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaTransactionSuccessParentFragment matchaTransactionSuccessParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaTransactionSuccessParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaTransactionSuccessParentFragment newInstance(Args args) {
            return (MatchaTransactionSuccessParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaTransactionSuccessParentFragment matchaTransactionSuccessParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaTransactionSuccessParentFragment, args);
        }
    }
}
