package com.robinhood.shared.onboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentIntentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/contracts/ChooseEmploymentIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "context", "Lcom/robinhood/shared/onboarding/contracts/ChooseEmploymentContext;", "isRhdOnboarding", "", "<init>", "(Lcom/robinhood/shared/onboarding/contracts/ChooseEmploymentContext;Z)V", "getContext", "()Lcom/robinhood/shared/onboarding/contracts/ChooseEmploymentContext;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ChooseEmploymentIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<ChooseEmploymentIntentKey> CREATOR = new Creator();
    private final ChooseEmploymentContext context;
    private final boolean isRhdOnboarding;

    /* compiled from: ChooseEmploymentIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChooseEmploymentIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseEmploymentIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChooseEmploymentIntentKey((ChooseEmploymentContext) parcel.readParcelable(ChooseEmploymentIntentKey.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChooseEmploymentIntentKey[] newArray(int i) {
            return new ChooseEmploymentIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChooseEmploymentIntentKey() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChooseEmploymentIntentKey copy$default(ChooseEmploymentIntentKey chooseEmploymentIntentKey, ChooseEmploymentContext chooseEmploymentContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            chooseEmploymentContext = chooseEmploymentIntentKey.context;
        }
        if ((i & 2) != 0) {
            z = chooseEmploymentIntentKey.isRhdOnboarding;
        }
        return chooseEmploymentIntentKey.copy(chooseEmploymentContext, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ChooseEmploymentContext getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRhdOnboarding() {
        return this.isRhdOnboarding;
    }

    public final ChooseEmploymentIntentKey copy(ChooseEmploymentContext context, boolean isRhdOnboarding) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ChooseEmploymentIntentKey(context, isRhdOnboarding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseEmploymentIntentKey)) {
            return false;
        }
        ChooseEmploymentIntentKey chooseEmploymentIntentKey = (ChooseEmploymentIntentKey) other;
        return Intrinsics.areEqual(this.context, chooseEmploymentIntentKey.context) && this.isRhdOnboarding == chooseEmploymentIntentKey.isRhdOnboarding;
    }

    public int hashCode() {
        return (this.context.hashCode() * 31) + Boolean.hashCode(this.isRhdOnboarding);
    }

    public String toString() {
        return "ChooseEmploymentIntentKey(context=" + this.context + ", isRhdOnboarding=" + this.isRhdOnboarding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.context, flags);
        dest.writeInt(this.isRhdOnboarding ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public ChooseEmploymentIntentKey(ChooseEmploymentContext context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isRhdOnboarding = z;
    }

    public /* synthetic */ ChooseEmploymentIntentKey(ChooseEmploymentContext chooseEmploymentContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChooseEmploymentContext.Default.INSTANCE : chooseEmploymentContext, (i & 2) != 0 ? false : z);
    }

    public final ChooseEmploymentContext getContext() {
        return this.context;
    }

    public final boolean isRhdOnboarding() {
        return this.isRhdOnboarding;
    }
}
