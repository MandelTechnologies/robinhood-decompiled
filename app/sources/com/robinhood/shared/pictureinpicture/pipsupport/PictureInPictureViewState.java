package com.robinhood.shared.pictureinpicture.pipsupport;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PictureInPictureViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureViewState;", "", "isInOptionsPipExperiment", "", "<init>", "(Z)V", "()Z", "lib-pip-support_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PictureInPictureViewState {
    private final boolean isInOptionsPipExperiment;

    public PictureInPictureViewState() {
        this(false, 1, null);
    }

    public PictureInPictureViewState(boolean z) {
        this.isInOptionsPipExperiment = z;
    }

    public /* synthetic */ PictureInPictureViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: isInOptionsPipExperiment, reason: from getter */
    public final boolean getIsInOptionsPipExperiment() {
        return this.isInOptionsPipExperiment;
    }
}
