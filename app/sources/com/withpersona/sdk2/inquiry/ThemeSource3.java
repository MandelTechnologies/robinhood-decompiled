package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;

/* compiled from: ThemeSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ServerThemeSource;", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "theme", "", "<init>", "(Ljava/lang/Integer;)V", "getTheme", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.ServerThemeSource, reason: use source file name */
/* loaded from: classes18.dex */
public final class ThemeSource3 implements ThemeSource {
    private final Integer theme;

    public ThemeSource3(Integer num) {
        this.theme = num;
    }

    @Override // com.withpersona.sdk2.inquiry.ThemeSource
    public Integer getTheme() {
        return this.theme;
    }
}
