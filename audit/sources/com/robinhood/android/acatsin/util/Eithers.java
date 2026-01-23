package com.robinhood.android.acatsin.util;

import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.Either;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: Eithers.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u001a\u0016\u0010\u000f\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u001a$\u0010\u0015\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017\"!\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"#\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"&\u0010\n\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\"&\u0010\f\u001a\u0004\u0018\u00010\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005\"!\u0010\u0013\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005¨\u0006\u0018"}, m3636d2 = {"name", "", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "getName", "(Lcom/robinhood/utils/Either;)Ljava/lang/String;", "logoUrl", "Lokhttp3/HttpUrl;", "getLogoUrl", "(Lcom/robinhood/utils/Either;)Lokhttp3/HttpUrl;", "brokerageNumber", "getBrokerageNumber", "brokerage", "getBrokerage", "(Lcom/robinhood/utils/Either;)Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "canUsePlaid", "", "loggingIdentifier", "getLoggingIdentifier", "dtcNumber", "getDtcNumber", "requiresCoOwnerSignature", "dtcsRequiringCoOwnerSignature", "", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.EithersKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class Eithers {
    public static final String getName(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getName();
        }
        if (!(either instanceof Either.Right)) {
            throw new NoWhenBranchMatchedException();
        }
        return "DTCC #" + ((Either.Right) either).getValue();
    }

    public static final HttpUrl getLogoUrl(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getLogo();
        }
        if (either instanceof Either.Right) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getBrokerageNumber(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getBrokerage_number();
        }
        if (either instanceof Either.Right) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ApiBrokerage getBrokerage(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return (ApiBrokerage) ((Either.Left) either).getValue();
        }
        if (either instanceof Either.Right) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean canUsePlaid(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getCanUsePlaid();
        }
        if (either instanceof Either.Right) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getLoggingIdentifier(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getName();
        }
        if (either instanceof Either.Right) {
            return (String) ((Either.Right) either).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getDtcNumber(Either<ApiBrokerage, String> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((ApiBrokerage) ((Either.Left) either).getValue()).getDtcc_number();
        }
        if (either instanceof Either.Right) {
            return (String) ((Either.Right) either).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean requiresCoOwnerSignature(Either<ApiBrokerage, String> either, List<String> dtcsRequiringCoOwnerSignature) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(dtcsRequiringCoOwnerSignature, "dtcsRequiringCoOwnerSignature");
        if (either instanceof Either.Left) {
            return Intrinsics.areEqual(((ApiBrokerage) ((Either.Left) either).getValue()).getCoowner_signature_required(), Boolean.TRUE);
        }
        if (either instanceof Either.Right) {
            return dtcsRequiringCoOwnerSignature.contains(((Either.Right) either).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
