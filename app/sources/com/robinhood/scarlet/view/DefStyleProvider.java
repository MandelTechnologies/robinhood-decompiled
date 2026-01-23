package com.robinhood.scarlet.view;

import kotlin.Metadata;

/* compiled from: DefStyleProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/scarlet/view/DefStyleProvider;", "", "defStyleAttr", "", "getDefStyleAttr", "()I", "defStyleRes", "getDefStyleRes", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface DefStyleProvider {

    /* compiled from: DefStyleProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static int getDefStyleAttr(DefStyleProvider defStyleProvider) {
            return 0;
        }

        public static int getDefStyleRes(DefStyleProvider defStyleProvider) {
            return 0;
        }
    }

    int getDefStyleAttr();

    int getDefStyleRes();
}
