package com.robinhood.android.signature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.extensions.ViewsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SignatureView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003 !\"B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paths", "", "Lcom/robinhood/android/signature/SignatureView$SignaturePath;", "signaturePaint", "Landroid/graphics/Paint;", "currentPath", "Lcom/robinhood/android/signature/SignatureView$SignaturePath$Builder;", "stateRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/signature/SignatureView$State;", "kotlin.jvm.PlatformType", "getStateRelay", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "clear", "", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "saveSignature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "State", "Signature", "SignaturePath", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SignatureView extends View {
    private SignaturePath.Builder currentPath;
    private final List<SignaturePath> paths;
    private final Paint signaturePaint;
    private final BehaviorRelay<State> stateRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paths = new ArrayList();
        SignatureHelper signatureHelper = SignatureHelper.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Paint paint = signatureHelper.getPaint(resources);
        ColorStateList foregroundTintList = getForegroundTintList();
        paint.setColor(foregroundTintList != null ? foregroundTintList.getDefaultColor() : ViewsKt.getColor(this, C28531R.color.text_color_primary));
        this.signaturePaint = paint;
        BehaviorRelay<State> behaviorRelayCreateDefault = BehaviorRelay.createDefault(State.CLEARED);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.stateRelay = behaviorRelayCreateDefault;
    }

    public /* synthetic */ SignatureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final BehaviorRelay<State> getStateRelay() {
        return this.stateRelay;
    }

    public final void clear() {
        this.paths.clear();
        this.stateRelay.accept(State.CLEARED);
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        SignaturePath.Builder builder;
        SignaturePath signaturePathBuild;
        Intrinsics.checkNotNullParameter(event, "event");
        float x = event.getX();
        float y = event.getY();
        int action = event.getAction();
        if (action == 0) {
            this.currentPath = new SignaturePath.Builder(new PointF(x, y));
        } else if (action == 1) {
            builder = this.currentPath;
            if (builder != null && (signaturePathBuild = builder.build()) != null) {
                this.paths.add(signaturePathBuild);
            }
            this.currentPath = null;
        } else if (action == 2) {
            SignaturePath.Builder builder2 = this.currentPath;
            if (builder2 != null) {
                builder2.append(new PointF(x, y));
            }
            if (this.stateRelay.getValue() == State.CLEARED) {
                this.stateRelay.accept(State.DRAWN);
            }
        } else {
            if (action != 3) {
                return super.onTouchEvent(event);
            }
            builder = this.currentPath;
            if (builder != null) {
                this.paths.add(signaturePathBuild);
            }
            this.currentPath = null;
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<T> it = this.paths.iterator();
        while (it.hasNext()) {
            ((SignaturePath) it.next()).draw(canvas, this.signaturePaint);
        }
        SignaturePath.Builder builder = this.currentPath;
        if (builder != null) {
            builder.draw(canvas, this.signaturePaint);
        }
    }

    public final Signature saveSignature() {
        return new Signature(new Size(getWidth(), getHeight()), this.paths);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SignatureView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureView$State;", "", "<init>", "(Ljava/lang/String;I)V", "CLEARED", "DRAWN", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CLEARED = new State("CLEARED", 0);
        public static final State DRAWN = new State("DRAWN", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{CLEARED, DRAWN};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: SignatureView.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureView$Signature;", "Landroid/os/Parcelable;", "size", "Landroid/util/Size;", "pathData", "", "Lcom/robinhood/android/signature/SignatureView$SignaturePath;", "<init>", "(Landroid/util/Size;Ljava/util/List;)V", "getSize", "()Landroid/util/Size;", "getPathData", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Signature implements Parcelable {
        public static final Parcelable.Creator<Signature> CREATOR = new Creator();
        private final List<SignaturePath> pathData;
        private final Size size;

        /* compiled from: SignatureView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Signature> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Signature createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Size size = parcel.readSize();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SignaturePath.CREATOR.createFromParcel(parcel));
                }
                return new Signature(size, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Signature[] newArray(int i) {
                return new Signature[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Signature copy$default(Signature signature, Size size, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                size = signature.size;
            }
            if ((i & 2) != 0) {
                list = signature.pathData;
            }
            return signature.copy(size, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        public final List<SignaturePath> component2() {
            return this.pathData;
        }

        public final Signature copy(Size size, List<SignaturePath> pathData) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(pathData, "pathData");
            return new Signature(size, pathData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Signature)) {
                return false;
            }
            Signature signature = (Signature) other;
            return Intrinsics.areEqual(this.size, signature.size) && Intrinsics.areEqual(this.pathData, signature.pathData);
        }

        public int hashCode() {
            return (this.size.hashCode() * 31) + this.pathData.hashCode();
        }

        public String toString() {
            return "Signature(size=" + this.size + ", pathData=" + this.pathData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSize(this.size);
            List<SignaturePath> list = this.pathData;
            dest.writeInt(list.size());
            Iterator<SignaturePath> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public Signature(Size size, List<SignaturePath> pathData) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(pathData, "pathData");
            this.size = size;
            this.pathData = pathData;
        }

        public final Size getSize() {
            return this.size;
        }

        public final List<SignaturePath> getPathData() {
            return this.pathData;
        }
    }

    /* compiled from: SignatureView.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureView$SignaturePath;", "Landroid/os/Parcelable;", "moveCoordinates", "Landroid/graphics/PointF;", "lineCoordinates", "", "<init>", "(Landroid/graphics/PointF;Ljava/util/List;)V", "getMoveCoordinates", "()Landroid/graphics/PointF;", "getLineCoordinates", "()Ljava/util/List;", "basePath", "Landroid/graphics/Path;", "getBasePath$annotations", "()V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Builder", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class SignaturePath implements Parcelable {
        public static final Parcelable.Creator<SignaturePath> CREATOR = new Creator();
        private final Path basePath;
        private final List<PointF> lineCoordinates;
        private final PointF moveCoordinates;

        /* compiled from: SignatureView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SignaturePath> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignaturePath createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PointF pointF = (PointF) parcel.readParcelable(SignaturePath.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SignaturePath.class.getClassLoader()));
                }
                return new SignaturePath(pointF, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignaturePath[] newArray(int i) {
                return new SignaturePath[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SignaturePath copy$default(SignaturePath signaturePath, PointF pointF, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                pointF = signaturePath.moveCoordinates;
            }
            if ((i & 2) != 0) {
                list = signaturePath.lineCoordinates;
            }
            return signaturePath.copy(pointF, list);
        }

        private static /* synthetic */ void getBasePath$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PointF getMoveCoordinates() {
            return this.moveCoordinates;
        }

        public final List<PointF> component2() {
            return this.lineCoordinates;
        }

        public final SignaturePath copy(PointF moveCoordinates, List<? extends PointF> lineCoordinates) {
            Intrinsics.checkNotNullParameter(moveCoordinates, "moveCoordinates");
            Intrinsics.checkNotNullParameter(lineCoordinates, "lineCoordinates");
            return new SignaturePath(moveCoordinates, lineCoordinates);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignaturePath)) {
                return false;
            }
            SignaturePath signaturePath = (SignaturePath) other;
            return Intrinsics.areEqual(this.moveCoordinates, signaturePath.moveCoordinates) && Intrinsics.areEqual(this.lineCoordinates, signaturePath.lineCoordinates);
        }

        public int hashCode() {
            return (this.moveCoordinates.hashCode() * 31) + this.lineCoordinates.hashCode();
        }

        public String toString() {
            return "SignaturePath(moveCoordinates=" + this.moveCoordinates + ", lineCoordinates=" + this.lineCoordinates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.moveCoordinates, flags);
            List<PointF> list = this.lineCoordinates;
            dest.writeInt(list.size());
            Iterator<PointF> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SignaturePath(PointF moveCoordinates, List<? extends PointF> lineCoordinates) {
            Intrinsics.checkNotNullParameter(moveCoordinates, "moveCoordinates");
            Intrinsics.checkNotNullParameter(lineCoordinates, "lineCoordinates");
            this.moveCoordinates = moveCoordinates;
            this.lineCoordinates = lineCoordinates;
            Path path = new Path();
            path.moveTo(moveCoordinates.x, moveCoordinates.y);
            for (PointF pointF : lineCoordinates) {
                path.lineTo(pointF.x, pointF.y);
            }
            this.basePath = path;
        }

        public final PointF getMoveCoordinates() {
            return this.moveCoordinates;
        }

        public final List<PointF> getLineCoordinates() {
            return this.lineCoordinates;
        }

        public final void draw(Canvas canvas, Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(paint, "paint");
            canvas.drawPath(this.basePath, paint);
        }

        /* compiled from: SignatureView.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureView$SignaturePath$Builder;", "", "moveCoordinates", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/PointF;)V", "lineCoordinates", "", "basePath", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "append", "point", "build", "Lcom/robinhood/android/signature/SignatureView$SignaturePath;", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Builder {
            private final Path basePath;
            private final List<PointF> lineCoordinates;
            private final PointF moveCoordinates;

            public Builder(PointF moveCoordinates) {
                Intrinsics.checkNotNullParameter(moveCoordinates, "moveCoordinates");
                this.moveCoordinates = moveCoordinates;
                this.lineCoordinates = new ArrayList();
                Path path = new Path();
                path.moveTo(moveCoordinates.x, moveCoordinates.y);
                this.basePath = path;
            }

            public final void draw(Canvas canvas, Paint paint) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(paint, "paint");
                canvas.drawPath(this.basePath, paint);
            }

            public final void append(PointF point) {
                Intrinsics.checkNotNullParameter(point, "point");
                this.lineCoordinates.add(point);
                this.basePath.lineTo(point.x, point.y);
            }

            public final SignaturePath build() {
                return new SignaturePath(this.moveCoordinates, CollectionsKt.toList(this.lineCoordinates));
            }
        }
    }
}
