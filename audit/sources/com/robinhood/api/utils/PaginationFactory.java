package com.robinhood.api.utils;

import com.robinhood.models.PaginatedResult;
import io.reactivex.Single;

/* compiled from: PaginationFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/utils/PaginationFactory;", "T", "", "generate", "Lio/reactivex/Single;", "Lcom/robinhood/models/PaginatedResult;", "cursor", "", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface PaginationFactory<T> {
    Single<? extends PaginatedResult<T>> generate(String cursor);
}
