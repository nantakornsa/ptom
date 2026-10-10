package com.kku.pawnshop.event;

import com.kku.pawnshop.domain.vo.Money;

/**
 * Observer Pattern ผ่าน Spring ApplicationEvent
 *
 * TicketOperationService แค่ publish อีเวนต์นี้ออกไป โดยไม่ผูกกับผู้รับอีเวนต์
 * ทำให้ส่วนอื่นสามารถรับเหตุการณ์การไถ่ถอนโดยไม่เพิ่ม coupling
 */
public record TicketRedeemedEvent(Long ticketId, String ticketNumber, Long customerId, Money totalPaid) {
}
