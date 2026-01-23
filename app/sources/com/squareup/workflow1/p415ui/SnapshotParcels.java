package com.squareup.workflow1.p415ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.Snapshot;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* compiled from: SnapshotParcels.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Landroid/os/Parcelable;", "Lcom/squareup/workflow1/Snapshot;", "toSnapshot", "(Landroid/os/Parcelable;)Lcom/squareup/workflow1/Snapshot;", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.SnapshotParcelsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SnapshotParcels {
    public static final Snapshot toSnapshot(final Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "<this>");
        return Snapshot.INSTANCE.write(new Function1<BufferedSink, Unit>() { // from class: com.squareup.workflow1.ui.SnapshotParcelsKt.toSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BufferedSink bufferedSink) throws IOException {
                invoke2(bufferedSink);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BufferedSink bufferedSink) throws IOException {
                Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                parcelObtain.writeParcelable(parcelable, 0);
                byte[] byteArray = parcelObtain.marshall();
                Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
                bufferedSink.write(byteArray);
                parcelObtain.recycle();
            }
        });
    }
}
