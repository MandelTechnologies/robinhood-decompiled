package com.withpersona.sdk2.inquiry.internal.p420ui;

import com.squareup.workflow1.p415ui.Compatible;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisableableScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ui/DisableableScreen;", "Lcom/squareup/workflow1/ui/Compatible;", "", "screen", "", "isEnabled", "", "name", "<init>", "(Ljava/lang/Object;ZLjava/lang/String;)V", "Ljava/lang/Object;", "getScreen", "()Ljava/lang/Object;", "Z", "()Z", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getCompatibilityKey", "compatibilityKey", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DisableableScreen implements Compatible {
    private final boolean isEnabled;
    private final String name;
    private final Object screen;

    public DisableableScreen(Object screen, boolean z, String name) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(name, "name");
        this.screen = screen;
        this.isEnabled = z;
        this.name = name;
    }

    public final Object getScreen() {
        return this.screen;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // com.squareup.workflow1.p415ui.Compatible
    /* renamed from: getCompatibilityKey, reason: from getter */
    public String getName() {
        return this.name;
    }
}
