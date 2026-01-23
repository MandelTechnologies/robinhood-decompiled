package com.plaid.link.exception;

import kotlin.Metadata;

@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/plaid/link/exception/LinkNoNetworkException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LinkNoNetworkException extends IllegalStateException {
    public static final LinkNoNetworkException INSTANCE = new LinkNoNetworkException();

    private LinkNoNetworkException() {
        super("No network is available, please check your internet connection before opening Link again.");
    }
}
