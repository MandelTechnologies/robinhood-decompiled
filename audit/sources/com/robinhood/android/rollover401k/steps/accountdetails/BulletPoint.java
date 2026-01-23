package com.robinhood.android.rollover401k.steps.accountdetails;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FoundAccountDetailsScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/accountdetails/BulletPoint;", "", "title", "", CarResultComposable2.BODY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BulletPoint {
    public static final int $stable = 0;
    private final String body;
    private final String title;

    public static /* synthetic */ BulletPoint copy$default(BulletPoint bulletPoint, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bulletPoint.title;
        }
        if ((i & 2) != 0) {
            str2 = bulletPoint.body;
        }
        return bulletPoint.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final BulletPoint copy(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        return new BulletPoint(title, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletPoint)) {
            return false;
        }
        BulletPoint bulletPoint = (BulletPoint) other;
        return Intrinsics.areEqual(this.title, bulletPoint.title) && Intrinsics.areEqual(this.body, bulletPoint.body);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "BulletPoint(title=" + this.title + ", body=" + this.body + ")";
    }

    public BulletPoint(String title, String body) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.title = title;
        this.body = body;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }
}
