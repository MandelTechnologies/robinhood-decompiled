package com.squareup.workflow1.p415ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.TreeSnapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: PickledTreesnapshot.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "Landroid/os/Parcelable;", "snapshot", "Lcom/squareup/workflow1/TreeSnapshot;", "(Lcom/squareup/workflow1/TreeSnapshot;)V", "getSnapshot$wf1_core_android", "()Lcom/squareup/workflow1/TreeSnapshot;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CREATOR", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PickledTreesnapshot implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TreeSnapshot snapshot;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PickledTreesnapshot(TreeSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    /* renamed from: getSnapshot$wf1_core_android, reason: from getter */
    public final TreeSnapshot getSnapshot() {
        return this.snapshot;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(this.snapshot.toByteString().toByteArray());
    }

    /* compiled from: PickledTreesnapshot.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    /* renamed from: com.squareup.workflow1.ui.PickledTreesnapshot$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<PickledTreesnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PickledTreesnapshot createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            Intrinsics.checkNotNull(bArrCreateByteArray);
            Intrinsics.checkNotNullExpressionValue(bArrCreateByteArray, "parcel.createByteArray()!!");
            return new PickledTreesnapshot(TreeSnapshot.INSTANCE.parse(ByteString.Companion.of$default(companion, bArrCreateByteArray, 0, 0, 3, null)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PickledTreesnapshot[] newArray(int size) {
            return new PickledTreesnapshot[size];
        }
    }
}
